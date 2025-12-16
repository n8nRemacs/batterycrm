package sv;

import Y61.k;
import androidx.view.C23038g0;
import com.avito.android.util.C35743a3;
import kotlin.Metadata;

/* compiled from: MutableLiveData.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_deeplink-handler"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: sv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C48419b {
    public static final <T> void a(@k C23038g0<T> c23038g0, T t12) {
        if (C35743a3.a()) {
            c23038g0.setValue(t12);
        } else {
            c23038g0.postValue(t12);
        }
    }
}
