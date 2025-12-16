package com.avito.android.remote.interceptor;

import android.location.Location;
import com.squareup.anvil.annotations.ContributesBinding;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GeoHeaderProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/c0;", "Lcom/avito/android/remote/interceptor/b0;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.c0, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C34275c0 implements InterfaceC34273b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo.j f253522a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DecimalFormat f253523b;

    @Inject
    public C34275c0(@Y61.k com.avito.android.geo.j jVar) {
        this.f253522a = jVar;
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator('.');
        DecimalFormat decimalFormat = new DecimalFormat("0.######", decimalFormatSymbols);
        this.f253523b = decimalFormat;
        decimalFormat.setGroupingUsed(false);
    }

    @Override // hd.InterfaceC40915a
    /* renamed from: b */
    public final boolean getF253513b() {
        return false;
    }

    @Override // hd.InterfaceC40915a
    @Y61.k
    public final String getKey() {
        return "X-Geo";
    }

    @Override // hd.InterfaceC40915a
    @Y61.l
    /* renamed from: getValue */
    public final String getF253512a() {
        Location locationJ = this.f253522a.j();
        if (locationJ == null) {
            return null;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(locationJ.getTime());
        kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
        Locale locale = Locale.ENGLISH;
        DecimalFormat decimalFormat = this.f253523b;
        return String.format(locale, "%s;%s;%s;%d", Arrays.copyOf(new Object[]{decimalFormat.format(locationJ.getLatitude()), decimalFormat.format(locationJ.getLongitude()), decimalFormat.format(locationJ.getAccuracy()), Long.valueOf(seconds)}, 4));
    }
}
