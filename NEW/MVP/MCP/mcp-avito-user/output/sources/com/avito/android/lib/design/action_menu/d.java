package com.avito.android.lib.design.action_menu;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.action_menu.f;
import com.avito.android.lib.design.action_menu.g;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ActionMenuState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/action_menu/d;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f178230a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<a> f178231b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f178232c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g f178233d;

    /* renamed from: e, reason: collision with root package name */
    public final int f178234e;

    /* renamed from: f, reason: collision with root package name */
    public final int f178235f;

    /* compiled from: ActionMenuState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/action_menu/d$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f178236a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f178237b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f178238c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Y41.a<G0> f178239d;

        /* compiled from: ActionMenuState.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.lib.design.action_menu.d$a$a, reason: collision with other inner class name */
        public static final class C5253a extends N implements Y41.a<G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C5253a f178240l = new C5253a();

            public C5253a() {
                super(0);
            }

            @Override // Y41.a
            public final /* bridge */ /* synthetic */ G0 invoke() {
                return G0.f406611a;
            }
        }

        public a() {
            throw null;
        }

        public a(PrintableText printableText, String str, boolean z12, Y41.a aVar, int i12, C42822w c42822w) {
            z12 = (i12 & 4) != 0 ? false : z12;
            aVar = (i12 & 8) != 0 ? C5253a.f178240l : aVar;
            this.f178236a = printableText;
            this.f178237b = str;
            this.f178238c = z12;
            this.f178239d = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f178236a, aVar.f178236a) && L.f(this.f178237b, aVar.f178237b) && this.f178238c == aVar.f178238c && L.f(this.f178239d, aVar.f178239d);
        }

        public final int hashCode() {
            int iHashCode = this.f178236a.hashCode() * 31;
            String str = this.f178237b;
            return this.f178239d.hashCode() + r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f178238c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionMenuItem(text=");
            sb2.append(this.f178236a);
            sb2.append(", iconName=");
            sb2.append(this.f178237b);
            sb2.append(", isLoading=");
            sb2.append(this.f178238c);
            sb2.append(", onClickListener=");
            return r.v(sb2, this.f178239d, ')');
        }
    }

    public d(@k View view, @k List<a> list, boolean z12, @k g gVar, int i12, int i13) {
        this.f178230a = view;
        this.f178231b = list;
        this.f178232c = z12;
        this.f178233d = gVar;
        this.f178234e = i12;
        this.f178235f = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f178230a, dVar.f178230a) && L.f(this.f178231b, dVar.f178231b) && this.f178232c == dVar.f178232c && L.f(this.f178233d, dVar.f178233d) && this.f178234e == dVar.f178234e && this.f178235f == dVar.f178235f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f178235f) + r.e(this.f178234e, (this.f178233d.hashCode() + r.i(H.e(this.f178230a.hashCode() * 31, 31, this.f178231b), 31, this.f178232c)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionMenuState(anchor=");
        sb2.append(this.f178230a);
        sb2.append(", items=");
        sb2.append(this.f178231b);
        sb2.append(", isShowing=");
        sb2.append(this.f178232c);
        sb2.append(", popupPosition=");
        sb2.append(this.f178233d);
        sb2.append(", offsetX=");
        sb2.append(this.f178234e);
        sb2.append(", offsetY=");
        return r.t(sb2, this.f178235f, ')');
    }

    public /* synthetic */ d(View view, List list, boolean z12, g gVar, int i12, int i13, int i14, C42822w c42822w) {
        this(view, list, (i14 & 4) != 0 ? true : z12, (i14 & 8) != 0 ? new g.a(f.a.f178259a) : gVar, (i14 & 16) != 0 ? y6.b(0) : i12, (i14 & 32) != 0 ? y6.b(0) : i13);
    }
}
