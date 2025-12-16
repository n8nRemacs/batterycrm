package TV0;

import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.konveyor.adapter.b;
import j.I;
import kotlin.Metadata;

/* compiled from: ViewHolderBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"LTV0/g;", "Lcom/avito/konveyor/adapter/b;", "T", "", "a", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface g<T extends com.avito.konveyor.adapter.b> {

    /* compiled from: ViewHolderBuilder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LTV0/g$a;", "Lcom/avito/konveyor/adapter/b;", "T", "", "_common_konveyor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T extends com.avito.konveyor.adapter.b> {

        /* renamed from: a, reason: collision with root package name */
        public final int f15692a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p<ViewGroup, View, T> f15693b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@I int i12, @k p<? super ViewGroup, ? super View, ? extends T> pVar) {
            this.f15692a = i12;
            this.f15693b = pVar;
        }
    }

    @l
    T k(@k ViewGroup viewGroup, int i12, @k Y41.l<? super Integer, ? extends View> lVar);
}
