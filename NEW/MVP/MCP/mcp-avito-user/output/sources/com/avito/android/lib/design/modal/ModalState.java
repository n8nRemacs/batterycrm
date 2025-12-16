package com.avito.android.lib.design.modal;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import j.r;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModalState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/modal/ModalState;", "", "a", "b", "c", "d", "State", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ModalState {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final CharSequence f179686a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final CharSequence f179687b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final List<Button> f179688c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f179689d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f179690e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final a f179691f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final View f179692g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final View f179693h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final State f179694i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f179695j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f179696k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ModalState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/modal/ModalState$State;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {

        /* renamed from: b, reason: collision with root package name */
        public static final State f179697b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ State[] f179698c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179699d;

        static {
            State state = new State("SHOW", 0);
            f179697b = state;
            State[] stateArr = {state, new State("DISMISS", 1)};
            f179698c = stateArr;
            f179699d = kotlin.enums.c.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f179698c.clone();
        }
    }

    /* compiled from: ModalState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/modal/ModalState$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    /* compiled from: ModalState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/modal/ModalState$b;", "Lcom/avito/android/lib/design/modal/ModalState$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "IllustrationView(view=null)";
        }
    }

    /* compiled from: ModalState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/modal/ModalState$c;", "Lcom/avito/android/lib/design/modal/ModalState$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Image f179700a;

        /* renamed from: b, reason: collision with root package name */
        public final int f179701b;

        /* renamed from: c, reason: collision with root package name */
        public final int f179702c;

        public c(@Y61.k Image image, @r int i12, @r int i13) {
            this.f179700a = image;
            this.f179701b = i12;
            this.f179702c = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f179700a, cVar.f179700a) && this.f179701b == cVar.f179701b && this.f179702c == cVar.f179702c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f179702c) + androidx.appcompat.app.r.e(this.f179701b, this.f179700a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoadImage(image=");
            sb2.append(this.f179700a);
            sb2.append(", width=");
            sb2.append(this.f179701b);
            sb2.append(", height=");
            return androidx.appcompat.app.r.t(sb2, this.f179702c, ')');
        }
    }

    /* compiled from: ModalState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/modal/ModalState$d;", "Lcom/avito/android/lib/design/modal/ModalState$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Drawable f179703a;

        public d() {
            this(null, 1, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f179703a, ((d) obj).f179703a);
        }

        public final int hashCode() {
            Drawable drawable = this.f179703a;
            if (drawable == null) {
                return 0;
            }
            return drawable.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "LocalImage(image=" + this.f179703a + ')';
        }

        public d(Drawable drawable, int i12, C42822w c42822w) {
            this.f179703a = (i12 & 1) != 0 ? null : drawable;
        }
    }

    public ModalState() {
        this(null, null, null, false, null, null, null, null, null, false, null, 2047, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalState)) {
            return false;
        }
        ModalState modalState = (ModalState) obj;
        return L.f(this.f179686a, modalState.f179686a) && L.f(this.f179687b, modalState.f179687b) && L.f(this.f179688c, modalState.f179688c) && this.f179689d == modalState.f179689d && L.f(this.f179690e, modalState.f179690e) && L.f(this.f179691f, modalState.f179691f) && L.f(this.f179692g, modalState.f179692g) && L.f(this.f179693h, modalState.f179693h) && this.f179694i == modalState.f179694i && this.f179695j == modalState.f179695j && L.f(this.f179696k, modalState.f179696k);
    }

    public final int hashCode() {
        CharSequence charSequence = this.f179686a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.f179687b;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        List<Button> list = this.f179688c;
        int i12 = androidx.appcompat.app.r.i((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f179689d);
        Y41.a<G0> aVar = this.f179690e;
        int iHashCode3 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f179691f;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        View view = this.f179692g;
        int iHashCode5 = (iHashCode4 + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f179693h;
        int i13 = androidx.appcompat.app.r.i((this.f179694i.hashCode() + ((iHashCode5 + (view2 == null ? 0 : view2.hashCode())) * 31)) * 31, 31, this.f179695j);
        Y41.a<G0> aVar3 = this.f179696k;
        return i13 + (aVar3 != null ? aVar3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModalState(title=");
        sb2.append((Object) this.f179686a);
        sb2.append(", subtitle=");
        sb2.append((Object) this.f179687b);
        sb2.append(", buttons=");
        sb2.append(this.f179688c);
        sb2.append(", closeButtonVisible=");
        sb2.append(this.f179689d);
        sb2.append(", onCloseClick=");
        sb2.append(this.f179690e);
        sb2.append(", image=");
        sb2.append(this.f179691f);
        sb2.append(", customBackground=");
        sb2.append(this.f179692g);
        sb2.append(", customView=");
        sb2.append(this.f179693h);
        sb2.append(", stateOfVisible=");
        sb2.append(this.f179694i);
        sb2.append(", cancelable=");
        sb2.append(this.f179695j);
        sb2.append(", onCancel=");
        return androidx.appcompat.app.r.v(sb2, this.f179696k, ')');
    }

    public ModalState(CharSequence charSequence, CharSequence charSequence2, List list, boolean z12, Y41.a aVar, a aVar2, View view, View view2, State state, boolean z13, Y41.a aVar3, int i12, C42822w c42822w) {
        charSequence = (i12 & 1) != 0 ? null : charSequence;
        charSequence2 = (i12 & 2) != 0 ? null : charSequence2;
        list = (i12 & 4) != 0 ? null : list;
        z12 = (i12 & 8) != 0 ? true : z12;
        aVar = (i12 & 16) != 0 ? null : aVar;
        aVar2 = (i12 & 32) != 0 ? null : aVar2;
        view = (i12 & 64) != 0 ? null : view;
        view2 = (i12 & 128) != 0 ? null : view2;
        state = (i12 & 256) != 0 ? State.f179697b : state;
        z13 = (i12 & 512) != 0 ? false : z13;
        aVar3 = (i12 & 1024) != 0 ? null : aVar3;
        this.f179686a = charSequence;
        this.f179687b = charSequence2;
        this.f179688c = list;
        this.f179689d = z12;
        this.f179690e = aVar;
        this.f179691f = aVar2;
        this.f179692g = view;
        this.f179693h = view2;
        this.f179694i = state;
        this.f179695j = z13;
        this.f179696k = aVar3;
    }
}
