package com.avito.android.code_check_public.screen;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: PhoneRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/screen/d;", "Lcom/avito/android/code_check_public/screen/h;", "a", "b", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f119360a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f119361b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<Phone, G0> f119362c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f119363d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f119364e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC43160i<To.d> f119365f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final p<C43501a, Continuation<? super To.d>, Object> f119366g;

    /* compiled from: PhoneRequest.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/d$a;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f119367a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final j f119368b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f119369c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f119370d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final j f119371e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final PrintableText f119372f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.c<Integer> f119373g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final com.avito.android.code_check_public.c<AttributedText> f119374h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final PrintableText f119375i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f119376j;

        public a() {
            throw null;
        }

        public a(PrintableText printableText, j jVar, PrintableText printableText2, PrintableText printableText3, j jVar2, PrintableText printableText4, com.avito.android.code_check_public.c cVar, com.avito.android.code_check_public.c cVar2, PrintableText printableText5, boolean z12, int i12, C42822w c42822w) {
            jVar = (i12 & 2) != 0 ? null : jVar;
            printableText2 = (i12 & 4) != 0 ? com.avito.android.printable_text.b.c(R.string.code_check_phone_input_hint, new Serializable[0]) : printableText2;
            printableText3 = (i12 & 8) != 0 ? com.avito.android.printable_text.b.c(R.string.code_check_phone_action, new Serializable[0]) : printableText3;
            jVar2 = (i12 & 16) != 0 ? null : jVar2;
            printableText4 = (i12 & 32) != 0 ? null : printableText4;
            cVar = (i12 & 64) != 0 ? new com.avito.android.bxcontent.mvi.entity.f(8) : cVar;
            cVar2 = (i12 & 128) != 0 ? null : cVar2;
            printableText5 = (i12 & 256) != 0 ? null : printableText5;
            z12 = (i12 & 512) != 0 ? true : z12;
            this.f119367a = printableText;
            this.f119368b = jVar;
            this.f119369c = printableText2;
            this.f119370d = printableText3;
            this.f119371e = jVar2;
            this.f119372f = printableText4;
            this.f119373g = cVar;
            this.f119374h = cVar2;
            this.f119375i = printableText5;
            this.f119376j = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f119367a, aVar.f119367a) && L.f(this.f119368b, aVar.f119368b) && L.f(this.f119369c, aVar.f119369c) && L.f(this.f119370d, aVar.f119370d) && L.f(this.f119371e, aVar.f119371e) && L.f(this.f119372f, aVar.f119372f) && L.f(this.f119373g, aVar.f119373g) && L.f(this.f119374h, aVar.f119374h) && L.f(this.f119375i, aVar.f119375i) && this.f119376j == aVar.f119376j;
        }

        public final int hashCode() {
            int iHashCode = this.f119367a.hashCode() * 31;
            j jVar = this.f119368b;
            int iF2 = com.avito.android.actions_sheet.a.f(this.f119370d, com.avito.android.actions_sheet.a.f(this.f119369c, (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31, 31), 31);
            j jVar2 = this.f119371e;
            int iHashCode2 = (iF2 + (jVar2 == null ? 0 : jVar2.hashCode())) * 31;
            PrintableText printableText = this.f119372f;
            int iHashCode3 = (this.f119373g.hashCode() + ((iHashCode2 + (printableText == null ? 0 : printableText.hashCode())) * 31)) * 31;
            com.avito.android.code_check_public.c<AttributedText> cVar = this.f119374h;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            PrintableText printableText2 = this.f119375i;
            return Boolean.hashCode(this.f119376j) + ((iHashCode4 + (printableText2 != null ? printableText2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhoneRequestContent(title=");
            sb2.append(this.f119367a);
            sb2.append(", legal=");
            sb2.append(this.f119368b);
            sb2.append(", inputHint=");
            sb2.append(this.f119369c);
            sb2.append(", buttonText=");
            sb2.append(this.f119370d);
            sb2.append(", subtitle=");
            sb2.append(this.f119371e);
            sb2.append(", noErrorsInputHighlight=");
            sb2.append(this.f119372f);
            sb2.append(", inputMarginTopPixels=");
            sb2.append(this.f119373g);
            sb2.append(", buttonLegal=");
            sb2.append(this.f119374h);
            sb2.append(", additionalButtonText=");
            sb2.append(this.f119375i);
            sb2.append(", isAutofocusNeeded=");
            return r.x(sb2, this.f119376j, ')');
        }
    }

    /* compiled from: PhoneRequest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/screen/d$b;", "Lcom/avito/android/code_check_public/screen/f;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b extends f {
        @k
        public InterfaceC43160i b() {
            return C43175k.w();
        }

        @k
        public abstract InterfaceC43160i<To.d> c(@l String str);
    }

    public d() {
        throw null;
    }

    public d(String str, i iVar, Y41.l lVar, b bVar, a aVar, InterfaceC43160i interfaceC43160i, p pVar, int i12, C42822w c42822w) {
        i iVar2 = (i12 & 2) != 0 ? new i(null, null, null, null, 15, null) : iVar;
        Y41.l lVar2 = (i12 & 4) != 0 ? null : lVar;
        InterfaceC43160i interfaceC43160iW = (i12 & 32) != 0 ? C43175k.w() : interfaceC43160i;
        p pVar2 = (i12 & 64) == 0 ? pVar : null;
        this.f119360a = str;
        this.f119361b = iVar2;
        this.f119362c = lVar2;
        this.f119363d = bVar;
        this.f119364e = aVar;
        this.f119365f = interfaceC43160iW;
        this.f119366g = pVar2;
    }

    @Override // com.avito.android.code_check_public.screen.h
    @k
    /* renamed from: U, reason: from getter */
    public final i getF119361b() {
        return this.f119361b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f119360a, dVar.f119360a) && L.f(this.f119361b, dVar.f119361b) && L.f(this.f119362c, dVar.f119362c) && L.f(this.f119363d, dVar.f119363d) && L.f(this.f119364e, dVar.f119364e) && L.f(this.f119365f, dVar.f119365f) && L.f(this.f119366g, dVar.f119366g);
    }

    @Override // com.avito.android.code_check_public.screen.h
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF119360a() {
        return this.f119360a;
    }

    public final int hashCode() {
        int iHashCode = (this.f119361b.hashCode() + (this.f119360a.hashCode() * 31)) * 31;
        Y41.l<Phone, G0> lVar = this.f119362c;
        int iHashCode2 = (this.f119365f.hashCode() + ((this.f119364e.hashCode() + ((this.f119363d.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        p<C43501a, Continuation<? super To.d>, Object> pVar = this.f119366g;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PhoneRequest(name=" + this.f119360a + ", navigation=" + this.f119361b + ", opener=" + this.f119362c + ", interactor=" + this.f119363d + ", content=" + this.f119364e + ", resultFlow=" + this.f119365f + ", deeplinkResultMapper=" + this.f119366g + ')';
    }
}
