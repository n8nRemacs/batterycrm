package h3;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import k3.InterfaceC42487e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import l3.i;

/* compiled from: FieldsetStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lh3/a;", "", "a", "fieldset_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: h3.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* data */ class C40765a {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final C11240a f396981l = new C11240a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final i f396982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f396983b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final i f396984c;

    /* renamed from: d, reason: collision with root package name */
    public final int f396985d;

    /* renamed from: e, reason: collision with root package name */
    public final int f396986e;

    /* renamed from: f, reason: collision with root package name */
    public final int f396987f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final i f396988g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final com.akita.view.foundation.util.a f396989h;

    /* renamed from: i, reason: collision with root package name */
    public final int f396990i;

    /* renamed from: j, reason: collision with root package name */
    public final int f396991j;

    /* renamed from: k, reason: collision with root package name */
    public final int f396992k;

    /* compiled from: FieldsetStyle.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh3/a$a;", "Lk3/e;", "Lh3/a;", "<init>", "()V", "fieldset_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: h3.a$a, reason: collision with other inner class name */
    public static final class C11240a implements InterfaceC42487e<C40765a> {
        public /* synthetic */ C11240a(C42822w c42822w) {
            this();
        }

        public C11240a() {
        }
    }

    public C40765a() {
        this(null, 0, null, 0, 0, 0, null, null, 0, 0, 0, 2047, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40765a)) {
            return false;
        }
        C40765a c40765a = (C40765a) obj;
        return L.f(this.f396982a, c40765a.f396982a) && this.f396983b == c40765a.f396983b && L.f(this.f396984c, c40765a.f396984c) && this.f396985d == c40765a.f396985d && this.f396986e == c40765a.f396986e && this.f396987f == c40765a.f396987f && L.f(this.f396988g, c40765a.f396988g) && L.f(this.f396989h, c40765a.f396989h) && this.f396990i == c40765a.f396990i && this.f396991j == c40765a.f396991j && this.f396992k == c40765a.f396992k;
    }

    public final int hashCode() {
        i iVar = this.f396982a;
        int iE2 = r.e(this.f396983b, (iVar == null ? 0 : iVar.hashCode()) * 31, 31);
        i iVar2 = this.f396984c;
        int iE3 = r.e(this.f396987f, r.e(this.f396986e, r.e(this.f396985d, (iE2 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31, 31), 31), 31);
        i iVar3 = this.f396988g;
        int iHashCode = (iE3 + (iVar3 == null ? 0 : iVar3.hashCode())) * 31;
        com.akita.view.foundation.util.a aVar = this.f396989h;
        return Integer.hashCode(this.f396992k) + r.e(this.f396991j, r.e(this.f396990i, (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FieldsetStyle(titleStyle=");
        sb2.append(this.f396982a);
        sb2.append(", titleBottomCompensation=");
        sb2.append(this.f396983b);
        sb2.append(", descriptionStyle=");
        sb2.append(this.f396984c);
        sb2.append(", descriptionTopPadding=");
        sb2.append(this.f396985d);
        sb2.append(", textAndContentPadding=");
        sb2.append(this.f396986e);
        sb2.append(", descriptionBottomCompensation=");
        sb2.append(this.f396987f);
        sb2.append(", hintTextStyle=");
        sb2.append(this.f396988g);
        sb2.append(", errorTextColor=");
        sb2.append(this.f396989h);
        sb2.append(", hintBottomPadding=");
        sb2.append(this.f396990i);
        sb2.append(", hintTopPadding=");
        sb2.append(this.f396991j);
        sb2.append(", paddingBetweenFields=");
        return r.t(sb2, this.f396992k, ')');
    }

    public C40765a(@l i iVar, int i12, @l i iVar2, int i13, int i14, int i15, @l i iVar3, @l com.akita.view.foundation.util.a aVar, int i16, int i17, int i18) {
        this.f396982a = iVar;
        this.f396983b = i12;
        this.f396984c = iVar2;
        this.f396985d = i13;
        this.f396986e = i14;
        this.f396987f = i15;
        this.f396988g = iVar3;
        this.f396989h = aVar;
        this.f396990i = i16;
        this.f396991j = i17;
        this.f396992k = i18;
    }

    public /* synthetic */ C40765a(i iVar, int i12, i iVar2, int i13, int i14, int i15, i iVar3, com.akita.view.foundation.util.a aVar, int i16, int i17, int i18, int i19, C42822w c42822w) {
        this((i19 & 1) != 0 ? null : iVar, (i19 & 2) != 0 ? 0 : i12, (i19 & 4) != 0 ? null : iVar2, (i19 & 8) != 0 ? 0 : i13, (i19 & 16) != 0 ? 0 : i14, (i19 & 32) != 0 ? 0 : i15, (i19 & 64) != 0 ? null : iVar3, (i19 & 128) == 0 ? aVar : null, (i19 & 256) != 0 ? 0 : i16, (i19 & 512) != 0 ? 0 : i17, (i19 & 1024) == 0 ? i18 : 0);
    }
}
