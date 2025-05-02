# Currency Converter App

A Java-based desktop application that allows users to convert amounts between different currencies using real-time exchange rates. This project serves as a mini-project to demonstrate proficiency in Java, Maven, and API integration.

## Features

- **Real-Time Exchange Rates**: Fetches up-to-date currency exchange rates from a reliable API.
- **User-Friendly Interface**: Intuitive GUI for easy input and result display.
- **Multiple Currency Support**: Supports conversion between various global currencies.
- **Error Handling**: Gracefully handles invalid inputs and API errors.

## Technologies Used

- **Java**: Core programming language for application logic.
- **Maven**: Build automation and dependency management.
- **JavaFX/Swing**: (Assumed) For building the graphical user interface.
- **HTTP Client**: To make API requests for exchange rates.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven 3.6 or higher

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/ghostofuzumaki/CurrencyConverterApp.git
   cd CurrencyConverterApp
   ```

2. **Build the project using Maven**:

   ```bash
   mvn clean install
   ```

3. **Run the application**:

   ```bash
   mvn exec:java -Dexec.mainClass="com.yourpackage.Main"
   ```

   *Replace `com.yourpackage.Main` with the actual main class path.*

## Usage

1. Launch the application.
2. Enter the amount you wish to convert.
3. Select the source and target currencies from the dropdown menus.
4. Click on the "Convert" button to view the converted amount.

## API Integration

This application integrates with a currency exchange rate API to fetch the latest rates. Ensure you have a stable internet connection for real-time conversions.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

## License

This project is licensed under the [MIT License](LICENSE).
