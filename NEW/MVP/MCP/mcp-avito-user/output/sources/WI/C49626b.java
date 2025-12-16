package wi;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: SegmentControlTabsSetting.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\b"}, d2 = {"Lwi/b;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$d;", "", "_style", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wi.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C49626b implements TabsScreenModel.d {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String _style;

    /* compiled from: SegmentControlTabsSetting.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi/b$a;", "Lwi/e;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wi.b$a */
    public static final class a implements InterfaceC49629e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f441748a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final kotlin.reflect.d<C49626b> f441749b = m0.f406844a.b(C49626b.class);

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f441750c = "segmentControl";

        @Override // wi.InterfaceC49629e
        @k
        public final String getType() {
            return f441750c;
        }

        @Override // wi.InterfaceC49629e
        @k
        public final kotlin.reflect.d<C49626b> getValue() {
            return f441749b;
        }
    }

    public C49626b(@l String str) {
        this._style = str;
    }

    @k
    public final String a() {
        String str = this._style;
        return str == null ? "standard" : str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49626b) && L.f(this._style, ((C49626b) obj)._style);
    }

    public final int hashCode() {
        String str = this._style;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SegmentControlTabsSetting(_style="), this._style, ')');
    }
}
