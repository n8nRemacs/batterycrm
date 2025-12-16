package Hi;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DetachedComponent.kt */
@F3
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LHi/e;", "", "a", "b", "LHi/e$a;", "LHi/e$b;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface e {

    /* compiled from: DetachedComponent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHi/e$a;", "LHi/e;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final D f7619a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BottomSheetHeight f7620b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final BottomSheetContentPaddings f7621c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final LinkedHashMap f7622d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final Y41.a<G0> f7623e;

        public a(@k D d12, @k BottomSheetHeight bottomSheetHeight, @k BottomSheetContentPaddings bottomSheetContentPaddings, @l LinkedHashMap linkedHashMap, @k Y41.a aVar) {
            this.f7619a = d12;
            this.f7620b = bottomSheetHeight;
            this.f7621c = bottomSheetContentPaddings;
            this.f7622d = linkedHashMap;
            this.f7623e = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7619a.equals(aVar.f7619a) && this.f7620b == aVar.f7620b && this.f7621c == aVar.f7621c && L.f(this.f7622d, aVar.f7622d) && this.f7623e.equals(aVar.f7623e);
        }

        public final int hashCode() {
            int iHashCode = (this.f7621c.hashCode() + ((this.f7620b.hashCode() + (this.f7619a.hashCode() * 31)) * 31)) * 31;
            LinkedHashMap linkedHashMap = this.f7622d;
            return this.f7623e.hashCode() + ((iHashCode + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheet(rendererState=");
            sb2.append(this.f7619a);
            sb2.append(", height=");
            sb2.append(this.f7620b);
            sb2.append(", contentPaddings=");
            sb2.append(this.f7621c);
            sb2.append(", metaInfo=");
            sb2.append(this.f7622d);
            sb2.append(", onDismiss=");
            return r.v(sb2, this.f7623e, ')');
        }
    }

    /* compiled from: DetachedComponent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHi/e$b;", "LHi/e;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f7624a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f7625b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final List<C36216a> f7626c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ModalButtonsOrientation f7627d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7628e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Y41.a<G0> f7629f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final com.avito.beduin.v2.interaction.detached.flow.modal.a f7630g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f7631h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final Y41.a<G0> f7632i;

        public b(@l String str, @l String str2, @l List<C36216a> list, @l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @l Y41.a<G0> aVar, @l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @k Y41.a<G0> aVar3) {
            this.f7624a = str;
            this.f7625b = str2;
            this.f7626c = list;
            this.f7627d = modalButtonsOrientation;
            this.f7628e = z12;
            this.f7629f = aVar;
            this.f7630g = aVar2;
            this.f7631h = z13;
            this.f7632i = aVar3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f7624a, bVar.f7624a) && L.f(this.f7625b, bVar.f7625b) && L.f(this.f7626c, bVar.f7626c) && this.f7627d == bVar.f7627d && this.f7628e == bVar.f7628e && L.f(this.f7629f, bVar.f7629f) && L.f(this.f7630g, bVar.f7630g) && this.f7631h == bVar.f7631h && L.f(this.f7632i, bVar.f7632i);
        }

        public final int hashCode() {
            String str = this.f7624a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f7625b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<C36216a> list = this.f7626c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            ModalButtonsOrientation modalButtonsOrientation = this.f7627d;
            int i12 = r.i((iHashCode3 + (modalButtonsOrientation == null ? 0 : modalButtonsOrientation.hashCode())) * 31, 31, this.f7628e);
            Y41.a<G0> aVar = this.f7629f;
            int iHashCode4 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2 = this.f7630g;
            return this.f7632i.hashCode() + r.i((iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31, this.f7631h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Modal(title=");
            sb2.append(this.f7624a);
            sb2.append(", subtitle=");
            sb2.append(this.f7625b);
            sb2.append(", buttons=");
            sb2.append(this.f7626c);
            sb2.append(", buttonsOrientation=");
            sb2.append(this.f7627d);
            sb2.append(", closeButtonVisible=");
            sb2.append(this.f7628e);
            sb2.append(", onCloseClick=");
            sb2.append(this.f7629f);
            sb2.append(", image=");
            sb2.append(this.f7630g);
            sb2.append(", cancelable=");
            sb2.append(this.f7631h);
            sb2.append(", onDismiss=");
            return r.v(sb2, this.f7632i, ')');
        }
    }
}
