package z0;

import Y61.k;
import Y61.l;
import android.os.LocaleList;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.platform.A;
import j.X;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidLocaleDelegate.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz0/b;", "Lz0/g;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public LocaleList f443671a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public f f443672b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A f443673c = new A();

    @k
    public final f a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f443673c) {
            f fVar = this.f443672b;
            if (fVar != null && localeList == this.f443671a) {
                return fVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(new e(localeList.get(i12)));
            }
            f fVar2 = new f(arrayList);
            this.f443671a = localeList;
            this.f443672b = fVar2;
            return fVar2;
        }
    }
}
