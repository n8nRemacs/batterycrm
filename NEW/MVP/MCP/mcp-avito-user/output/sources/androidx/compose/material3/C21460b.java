package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* compiled from: ActualJvm.jvm.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\u001e\b\u0000\u0010\u0004\u001a\u0004\b\u0000\u0010\u0002\"\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0005"}, d2 = {"Ljava/util/Locale;", "CalendarLocale", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "InternalAtomicReference", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21460b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final WeakHashMap<String, NumberFormat> f36065a = new WeakHashMap<>();

    public static String a(int i12, int i13) {
        int i14 = (i13 & 1) == 0 ? 2 : 1;
        String str = i14 + ".40.false." + Locale.getDefault().toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = f36065a;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i14);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance.format(Integer.valueOf(i12));
    }
}
