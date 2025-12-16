package com.avito.android.sx_address.new_address.view;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: TypeItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/B;", "Lcom/avito/android/sx_address/new_address/view/A;", "a", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class B implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f293851a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Chips f293852b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f293853c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f293854d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f293855e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Y41.a<Boolean> f293856f;

    /* compiled from: TypeItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/B$a;", "Lcom/avito/android/lib/design/chips/h;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements com.avito.android.lib.design.chips.h {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f293857b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f293858c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final AttributedText f293859d;

        public a(@Y61.k String str, boolean z12, @Y61.l AttributedText attributedText) {
            this.f293857b = str;
            this.f293858c = z12;
            this.f293859d = attributedText;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean A1() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final Y41.l<Boolean, G0> L() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean P1() {
            return false;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.g Q1() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        public final boolean V1(@Y61.k Object obj) {
            return (obj instanceof a) && L.f(((a) obj).f293857b, this.f293857b);
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.k
        /* renamed from: W */
        public final CharSequence getF199741b() {
            return this.f293857b;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e e2() {
            return null;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f293857b, aVar.f293857b) && this.f293858c == aVar.f293858c && L.f(this.f293859d, aVar.f293859d);
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: g0, reason: from getter */
        public final boolean getF293858c() {
            return this.f293858c;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        @InterfaceC42156l
        /* renamed from: getIconColor */
        public final Integer getF178767g() {
            return null;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e getImage() {
            return null;
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(this.f293857b.hashCode() * 31, 31, this.f293858c);
            AttributedText attributedText = this.f293859d;
            return i12 + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isActive */
        public final boolean getF178770j() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        /* renamed from: isEnabled */
        public final boolean getF281693d() {
            return true;
        }

        @Override // com.avito.android.lib.design.chips.h
        @Y61.l
        public final com.avito.android.lib.design.chips.e q1() {
            return null;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChipableType(chipTitle=");
            sb2.append((Object) this.f293857b);
            sb2.append(", isSelectedChip=");
            sb2.append(this.f293858c);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f293859d, ')');
        }
    }

    public B(@Y61.k View view) {
        this.f293851a = view;
        View viewFindViewById = view.findViewById(R.id.type_chips_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f293852b = (Chips) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.type_chips_hint);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f293853c = (TextView) viewFindViewById2;
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f293854d = e2VarB;
        this.f293855e = e2VarB;
    }

    public final void a(a aVar) {
        ArrayList arrayList = (ArrayList) this.f293852b.s();
        boolean z12 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (L.f(((com.avito.android.lib.design.chips.h) it.next()).getF199741b(), aVar.f293857b)) {
                    z12 = true;
                    break;
                }
            }
        }
        AttributedText attributedText = aVar.f293859d;
        TextView textView = this.f293853c;
        if (attributedText != null && !z12) {
            D6.w(textView);
        } else {
            if (attributedText == null || !z12) {
                return;
            }
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }
}
