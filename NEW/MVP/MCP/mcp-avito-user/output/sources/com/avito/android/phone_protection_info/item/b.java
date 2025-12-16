package com.avito.android.phone_protection_info.item;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import j.InterfaceC42161q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhoneProtectionDisclaimerItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/phone_protection_info/item/b;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_phone-protection-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final a f216012b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C6479b f216013c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f216014d;

    /* compiled from: PhoneProtectionDisclaimerItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_protection_info/item/b$a;", "", "_avito_phone-protection-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f216015a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f216016b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f216017c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f216018d;

        public a() {
            this(null, null, null, null, 15, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f216015a, aVar.f216015a) && L.f(this.f216016b, aVar.f216016b) && L.f(this.f216017c, aVar.f216017c) && L.f(this.f216018d, aVar.f216018d);
        }

        public final int hashCode() {
            return this.f216018d.hashCode() + com.avito.android.actions_sheet.a.f(this.f216017c, com.avito.android.actions_sheet.a.f(this.f216016b, this.f216015a.hashCode() * 31, 31), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DisclaimerState(title=");
            sb2.append(this.f216015a);
            sb2.append(", message=");
            sb2.append(this.f216016b);
            sb2.append(", linkText=");
            sb2.append(this.f216017c);
            sb2.append(", link=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f216018d, ')');
        }

        public a(@k PrintableText printableText, @k PrintableText printableText2, @k PrintableText printableText3, @k DeepLink deepLink) {
            this.f216015a = printableText;
            this.f216016b = printableText2;
            this.f216017c = printableText3;
            this.f216018d = deepLink;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public a(com.avito.android.printable_text.PrintableText r28, com.avito.android.printable_text.PrintableText r29, com.avito.android.printable_text.PrintableText r30, com.avito.android.deep_linking.links.DeepLink r31, int r32, kotlin.jvm.internal.C42822w r33) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.phone_protection_info.item.b.a.<init>(com.avito.android.printable_text.PrintableText, com.avito.android.printable_text.PrintableText, com.avito.android.printable_text.PrintableText, com.avito.android.deep_linking.links.DeepLink, int, kotlin.jvm.internal.w):void");
        }
    }

    /* compiled from: PhoneProtectionDisclaimerItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_protection_info/item/b$b;", "", "_avito_phone-protection-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.phone_protection_info.item.b$b, reason: collision with other inner class name */
    public static final /* data */ class C6479b {

        /* renamed from: a, reason: collision with root package name */
        public final int f216019a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f216020b;

        /* JADX WARN: Multi-variable type inference failed */
        public C6479b() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6479b)) {
                return false;
            }
            C6479b c6479b = (C6479b) obj;
            return this.f216019a == c6479b.f216019a && L.f(this.f216020b, c6479b.f216020b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f216019a) * 31;
            Integer num = this.f216020b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DisclaimerStyle(horizontalMarginRes=");
            sb2.append(this.f216019a);
            sb2.append(", topMarginRes=");
            return s.j(sb2, this.f216020b, ')');
        }

        public C6479b(@InterfaceC42161q int i12, @InterfaceC42161q @l Integer num) {
            this.f216019a = i12;
            this.f216020b = num;
        }

        public /* synthetic */ C6479b(int i12, Integer num, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? R.dimen.protection_banner_horizontal_margin : i12, (i13 & 2) != 0 ? null : num);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return getF217269b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217269b() {
        return this.f216014d;
    }

    public b(@k a aVar, @k C6479b c6479b) {
        this.f216012b = aVar;
        this.f216013c = c6479b;
        this.f216014d = "disclaimer_id";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(a aVar, C6479b c6479b, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new a(null, null, null, null, 15, null) : aVar, (i12 & 2) != 0 ? new C6479b(0, null, 3, 0 == true ? 1 : 0) : c6479b);
    }
}
