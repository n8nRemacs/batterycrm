package com.avito.android.code_check_public.screen;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.d;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kv.C43501a;

/* compiled from: PhoneList.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList;", "Lcom/avito/android/code_check_public/screen/h;", "ItemIcon", "a", "b", "c", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PhoneList implements h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f119301a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final i f119302b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.l<Phone, G0> f119303c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f119304d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final d.b f119305e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC43160i<To.d> f119306f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final p<C43501a, Continuation<? super To.d>, Object> f119307g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhoneList.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList$ItemIcon;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemIcon {

        /* renamed from: b, reason: collision with root package name */
        public static final ItemIcon f119308b;

        /* renamed from: c, reason: collision with root package name */
        public static final ItemIcon f119309c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ItemIcon[] f119310d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f119311e;

        static {
            ItemIcon itemIcon = new ItemIcon("WARNING_RED", 0);
            f119308b = itemIcon;
            ItemIcon itemIcon2 = new ItemIcon("PLUS_BLACK", 1);
            f119309c = itemIcon2;
            ItemIcon[] itemIconArr = {itemIcon, itemIcon2};
            f119310d = itemIconArr;
            f119311e = kotlin.enums.c.a(itemIconArr);
        }

        public ItemIcon() {
            throw null;
        }

        public static ItemIcon valueOf(String str) {
            return (ItemIcon) Enum.valueOf(ItemIcon.class, str);
        }

        public static ItemIcon[] values() {
            return (ItemIcon[]) f119310d.clone();
        }
    }

    /* compiled from: PhoneList.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList$b;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f119315a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f119316b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final c f119317c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final com.avito.android.code_check_public.c<AttributedText> f119318d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final PrintableText f119319e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ItemIcon f119320f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final a f119321g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final a f119322h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f119323i;

        public b() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(PrintableText printableText, PrintableText printableText2, c cVar, com.avito.android.code_check_public.c cVar2, PrintableText printableText3, ItemIcon itemIcon, a aVar, a aVar2, boolean z12, int i12, C42822w c42822w) {
            Y41.l lVar = null;
            Object[] objArr = 0;
            printableText2 = (i12 & 2) != 0 ? null : printableText2;
            cVar = (i12 & 4) != 0 ? new c.b.C3501b(8, lVar, 2, objArr == true ? 1 : 0) : cVar;
            cVar2 = (i12 & 8) != 0 ? null : cVar2;
            printableText3 = (i12 & 16) != 0 ? null : printableText3;
            itemIcon = (i12 & 32) != 0 ? null : itemIcon;
            aVar = (i12 & 64) != 0 ? null : aVar;
            aVar2 = (i12 & 128) != 0 ? null : aVar2;
            z12 = (i12 & 256) != 0 ? true : z12;
            this.f119315a = printableText;
            this.f119316b = printableText2;
            this.f119317c = cVar;
            this.f119318d = cVar2;
            this.f119319e = printableText3;
            this.f119320f = itemIcon;
            this.f119321g = aVar;
            this.f119322h = aVar2;
            this.f119323i = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f119315a, bVar.f119315a) && L.f(this.f119316b, bVar.f119316b) && L.f(this.f119317c, bVar.f119317c) && L.f(this.f119318d, bVar.f119318d) && L.f(this.f119319e, bVar.f119319e) && this.f119320f == bVar.f119320f && L.f(this.f119321g, bVar.f119321g) && L.f(this.f119322h, bVar.f119322h) && this.f119323i == bVar.f119323i;
        }

        public final int hashCode() {
            int iHashCode = this.f119315a.hashCode() * 31;
            PrintableText printableText = this.f119316b;
            int iHashCode2 = (this.f119317c.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31)) * 31;
            com.avito.android.code_check_public.c<AttributedText> cVar = this.f119318d;
            int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            PrintableText printableText2 = this.f119319e;
            int iHashCode4 = (iHashCode3 + (printableText2 == null ? 0 : printableText2.hashCode())) * 31;
            ItemIcon itemIcon = this.f119320f;
            int iHashCode5 = (iHashCode4 + (itemIcon == null ? 0 : itemIcon.hashCode())) * 31;
            a aVar = this.f119321g;
            int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            a aVar2 = this.f119322h;
            return Boolean.hashCode(this.f119323i) + ((iHashCode6 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PhoneListContent(title=");
            sb2.append(this.f119315a);
            sb2.append(", emptySearchText=");
            sb2.append(this.f119316b);
            sb2.append(", showSearch=");
            sb2.append(this.f119317c);
            sb2.append(", subtitle=");
            sb2.append(this.f119318d);
            sb2.append(", searchHint=");
            sb2.append(this.f119319e);
            sb2.append(", phoneIcon=");
            sb2.append(this.f119320f);
            sb2.append(", newPhoneItem=");
            sb2.append(this.f119321g);
            sb2.append(", additionalButton=");
            sb2.append(this.f119322h);
            sb2.append(", showNewPhoneItemOnTop=");
            return r.x(sb2, this.f119323i, ')');
        }
    }

    /* compiled from: PhoneList.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList$c;", "", "a", "b", "Lcom/avito/android/code_check_public/screen/PhoneList$c$a;", "Lcom/avito/android/code_check_public/screen/PhoneList$c$b;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c {

        /* compiled from: PhoneList.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList$c$a;", "Lcom/avito/android/code_check_public/screen/PhoneList$c;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f119324a = new a();
        }

        /* compiled from: PhoneList.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList$c$b;", "Lcom/avito/android/code_check_public/screen/PhoneList$c;", "a", "b", "Lcom/avito/android/code_check_public/screen/PhoneList$c$b$a;", "Lcom/avito/android/code_check_public/screen/PhoneList$c$b$b;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface b extends c {

            /* compiled from: PhoneList.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList$c$b$a;", "Lcom/avito/android/code_check_public/screen/PhoneList$c$b;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a implements b {

                /* renamed from: a, reason: collision with root package name */
                @l
                public final Y41.l<String, G0> f119325a;

                public a() {
                    this(null, 1, null);
                }

                @Override // com.avito.android.code_check_public.screen.PhoneList.c.b
                @l
                public final Y41.l<String, G0> a() {
                    return this.f119325a;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && L.f(this.f119325a, ((a) obj).f119325a);
                }

                public final int hashCode() {
                    Y41.l<String, G0> lVar = this.f119325a;
                    if (lVar == null) {
                        return 0;
                    }
                    return lVar.hashCode();
                }

                @k
                public final String toString() {
                    return H.l(new StringBuilder("Always(editSearchCallback="), this.f119325a, ')');
                }

                public a(Y41.l lVar, int i12, C42822w c42822w) {
                    this.f119325a = (i12 & 1) != 0 ? null : lVar;
                }
            }

            @l
            Y41.l<String, G0> a();

            /* compiled from: PhoneList.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList$c$b$b;", "Lcom/avito/android/code_check_public/screen/PhoneList$c$b;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.code_check_public.screen.PhoneList$c$b$b, reason: collision with other inner class name */
            public static final /* data */ class C3501b implements b {

                /* renamed from: a, reason: collision with root package name */
                public final int f119326a;

                /* renamed from: b, reason: collision with root package name */
                @l
                public final Y41.l<String, G0> f119327b;

                /* JADX WARN: Multi-variable type inference failed */
                public C3501b(int i12, @l Y41.l<? super String, G0> lVar) {
                    this.f119326a = i12;
                    this.f119327b = lVar;
                }

                @Override // com.avito.android.code_check_public.screen.PhoneList.c.b
                @l
                public final Y41.l<String, G0> a() {
                    return this.f119327b;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3501b)) {
                        return false;
                    }
                    C3501b c3501b = (C3501b) obj;
                    return this.f119326a == c3501b.f119326a && L.f(this.f119327b, c3501b.f119327b);
                }

                public final int hashCode() {
                    int iHashCode = Integer.hashCode(this.f119326a) * 31;
                    Y41.l<String, G0> lVar = this.f119327b;
                    return iHashCode + (lVar == null ? 0 : lVar.hashCode());
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("WhenPhonesCountIsMoreThan(count=");
                    sb2.append(this.f119326a);
                    sb2.append(", editSearchCallback=");
                    return H.l(sb2, this.f119327b, ')');
                }

                public /* synthetic */ C3501b(int i12, Y41.l lVar, int i13, C42822w c42822w) {
                    this(i12, (i13 & 2) != 0 ? null : lVar);
                }
            }
        }
    }

    public PhoneList() {
        throw null;
    }

    public PhoneList(String str, i iVar, Y41.l lVar, b bVar, d.b bVar2, InterfaceC43160i interfaceC43160i, p pVar, int i12, C42822w c42822w) {
        i iVar2 = (i12 & 2) != 0 ? new i(null, null, null, null, 15, null) : iVar;
        Y41.l lVar2 = (i12 & 4) != 0 ? null : lVar;
        d.b eVar = (i12 & 16) != 0 ? new e() : bVar2;
        InterfaceC43160i interfaceC43160iW = (i12 & 32) != 0 ? C43175k.w() : interfaceC43160i;
        p pVar2 = (i12 & 64) == 0 ? pVar : null;
        this.f119301a = str;
        this.f119302b = iVar2;
        this.f119303c = lVar2;
        this.f119304d = bVar;
        this.f119305e = eVar;
        this.f119306f = interfaceC43160iW;
        this.f119307g = pVar2;
    }

    @Override // com.avito.android.code_check_public.screen.h
    @k
    /* renamed from: U, reason: from getter */
    public final i getF119361b() {
        return this.f119302b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneList)) {
            return false;
        }
        PhoneList phoneList = (PhoneList) obj;
        return L.f(this.f119301a, phoneList.f119301a) && L.f(this.f119302b, phoneList.f119302b) && L.f(this.f119303c, phoneList.f119303c) && L.f(this.f119304d, phoneList.f119304d) && L.f(this.f119305e, phoneList.f119305e) && L.f(this.f119306f, phoneList.f119306f) && L.f(this.f119307g, phoneList.f119307g);
    }

    @Override // com.avito.android.code_check_public.screen.h
    @k
    /* renamed from: getName, reason: from getter */
    public final String getF119360a() {
        return this.f119301a;
    }

    public final int hashCode() {
        int iHashCode = (this.f119302b.hashCode() + (this.f119301a.hashCode() * 31)) * 31;
        Y41.l<Phone, G0> lVar = this.f119303c;
        int iHashCode2 = (this.f119306f.hashCode() + ((this.f119305e.hashCode() + ((this.f119304d.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        p<C43501a, Continuation<? super To.d>, Object> pVar = this.f119307g;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "PhoneList(name=" + this.f119301a + ", navigation=" + this.f119302b + ", opener=" + this.f119303c + ", content=" + this.f119304d + ", interactor=" + this.f119305e + ", resultFlow=" + this.f119306f + ", deeplinkResultMapper=" + this.f119307g + ')';
    }

    /* compiled from: PhoneList.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/screen/PhoneList$a;", "", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f119312a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.a f119313b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ItemIcon f119314c;

        public a(@k PrintableText printableText, @k com.avito.android.code_check_public.a aVar, @l ItemIcon itemIcon) {
            this.f119312a = printableText;
            this.f119313b = aVar;
            this.f119314c = itemIcon;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f119312a, aVar.f119312a) && L.f(this.f119313b, aVar.f119313b) && this.f119314c == aVar.f119314c;
        }

        public final int hashCode() {
            int iHashCode = (this.f119313b.hashCode() + (this.f119312a.hashCode() * 31)) * 31;
            ItemIcon itemIcon = this.f119314c;
            return iHashCode + (itemIcon == null ? 0 : itemIcon.hashCode());
        }

        @k
        public final String toString() {
            return "PhoneItem(text=" + this.f119312a + ", action=" + this.f119313b + ", icon=" + this.f119314c + ')';
        }

        public /* synthetic */ a(PrintableText printableText, com.avito.android.code_check_public.a aVar, ItemIcon itemIcon, int i12, C42822w c42822w) {
            this(printableText, aVar, (i12 & 4) != 0 ? null : itemIcon);
        }
    }
}
