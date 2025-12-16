package kotlin.reflect.jvm.internal.calls;

import androidx.compose.foundation.H;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "", "entry", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class c extends N implements Y41.l<Map.Entry<? extends String, ? extends Object>, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final c f407115l = new c();

    public c() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
        Map.Entry<? extends String, ? extends Object> entry2 = entry;
        String key = entry2.getKey();
        Object value = entry2.getValue();
        return H.i('=', key, value instanceof boolean[] ? Arrays.toString((boolean[]) value) : value instanceof char[] ? Arrays.toString((char[]) value) : value instanceof byte[] ? Arrays.toString((byte[]) value) : value instanceof short[] ? Arrays.toString((short[]) value) : value instanceof int[] ? Arrays.toString((int[]) value) : value instanceof float[] ? Arrays.toString((float[]) value) : value instanceof long[] ? Arrays.toString((long[]) value) : value instanceof double[] ? Arrays.toString((double[]) value) : value instanceof Object[] ? Arrays.toString((Object[]) value) : value.toString());
    }
}
