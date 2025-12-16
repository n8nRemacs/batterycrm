package wi;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.ui.screen.fragment.tabs.model.TabsScreenModel;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;

/* compiled from: ChipsTabsSetting.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwi/a;", "Lcom/avito/android/beduin/ui/screen/fragment/tabs/model/TabsScreenModel$d;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C49625a implements TabsScreenModel.d {

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    /* compiled from: ChipsTabsSetting.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwi/a$a;", "Lwi/e;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wi.a$a, reason: collision with other inner class name */
    public static final class C12826a implements InterfaceC49629e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12826a f441745a = new C12826a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final kotlin.reflect.d<C49625a> f441746b = m0.f406844a.b(C49625a.class);

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f441747c = "chips";

        @Override // wi.InterfaceC49629e
        @k
        public final String getType() {
            return f441747c;
        }

        @Override // wi.InterfaceC49629e
        @k
        public final kotlin.reflect.d<C49625a> getValue() {
            return f441746b;
        }
    }

    public C49625a(@l String str) {
        this.style = str;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49625a) && L.f(this.style, ((C49625a) obj).style);
    }

    public final int hashCode() {
        String str = this.style;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ChipsTabsSetting(style="), this.style, ')');
    }
}
