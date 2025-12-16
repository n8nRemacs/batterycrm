package defpackage;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class pd implements xzf {
    public static final Address b = new Address(Locale.ROOT);
    public static final Map c = Collections.synchronizedMap(new kr8(100, 0));
    public final bwf a;

    public pd(Context context, bwf bwfVar) {
        this.a = new bwf(new m3(context, 1, bwfVar));
    }

    public static String d(Address address, String str, Address address2) {
        if (address2 != null) {
            String locality = address.getLocality();
            if (!g(locality) && !fni.a(locality, address2.getLocality())) {
                return u45.k(locality, " ", str);
            }
        }
        return str;
    }

    public static String e(Address address, String str, Address address2) {
        if (address2 != null) {
            String countryName = address.getCountryName();
            if (!g(countryName) && !fni.a(countryName, address2.getCountryName())) {
                return u45.k(countryName, " ", str);
            }
        }
        return str;
    }

    public static boolean g(String str) {
        return l8g.c(str) || l8g.a(str, "Unnamed Road") || l8g.a(str, "Null");
    }

    @Override // defpackage.xzf
    public final float a(double d, double d2, double d3, double d4) {
        return (float) jca.b(d, d2, d3, d4);
    }

    @Override // defpackage.xzf
    public final Object b(double d, double d2, double d3, double d4, q44 q44Var) throws IOException {
        Address addressF = f(d, d2);
        if (addressF == null) {
            return "";
        }
        Address addressF2 = f(d3, d4);
        String thoroughfare = addressF.getThoroughfare();
        if (g(thoroughfare)) {
            thoroughfare = null;
        } else {
            String subThoroughfare = addressF.getSubThoroughfare();
            if (!g(subThoroughfare)) {
                thoroughfare = u45.k(thoroughfare, " ", subThoroughfare);
            }
        }
        if (!g(thoroughfare)) {
            return l6g.e(e(addressF, d(addressF, thoroughfare, addressF2), addressF2));
        }
        String featureName = addressF.getFeatureName();
        if (!g(featureName) && !featureName.matches("\\d+")) {
            return l6g.e(e(addressF, d(addressF, featureName, addressF2), addressF2));
        }
        String locality = addressF.getLocality();
        if (!g(locality)) {
            return l6g.e(e(addressF, locality, addressF2));
        }
        String adminArea = addressF.getAdminArea();
        if (!g(adminArea)) {
            return l6g.e(e(addressF, adminArea, addressF2));
        }
        String countryName = addressF.getCountryName();
        if (!g(countryName)) {
            return l6g.e(countryName);
        }
        String addressLine = addressF.getMaxAddressLineIndex() != -1 ? addressF.getAddressLine(0) : "";
        if (!g(addressLine)) {
            return addressLine;
        }
        String countryName2 = addressF.getCountryName();
        if (!l8g.c(countryName2)) {
            addressLine = countryName2;
        }
        String locality2 = addressF.getLocality();
        return l8g.c(locality2) ? addressLine : l8g.c(countryName2) ? locality2 : u45.k(addressLine, ", ", locality2);
    }

    @Override // defpackage.xzf
    public final boolean c(double d, double d2, double d3, double d4) {
        return ((float) jca.b(d, d2, d3, d4)) < 10.0f;
    }

    public final Address f(double d, double d2) throws IOException {
        double d3;
        double d4;
        if (d != 0.0d || d2 != 0.0d) {
            imb imbVar = new imb(Double.valueOf(d), Double.valueOf(d2));
            Map map = c;
            Address address = (Address) map.get(imbVar);
            Address address2 = b;
            if (address != address2) {
                if (address != null) {
                    return address;
                }
                try {
                    d3 = d;
                    d4 = d2;
                    try {
                        List<Address> fromLocation = ((Geocoder) this.a.getValue()).getFromLocation(d3, d4, 1);
                        if (fromLocation == null || fromLocation.isEmpty()) {
                            map.put(imbVar, address2);
                            return null;
                        }
                        Address address3 = fromLocation.get(0);
                        map.put(imbVar, address3);
                        return address3;
                    } catch (IOException unused) {
                        wqi.e("pd", String.format(Locale.ENGLISH, "Can't decode latitude = %s longitude = %s", Arrays.copyOf(new Object[]{Double.valueOf(d3), Double.valueOf(d4)}, 2)), null);
                        return null;
                    }
                } catch (IOException unused2) {
                    d3 = d;
                    d4 = d2;
                }
            }
        }
        return null;
    }
}
