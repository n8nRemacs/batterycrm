package jp;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import com.akita.compose.component.chips.InterfaceC27333b;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TypeChip.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljp/b;", "Lcom/akita/compose/component/chips/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C42410b implements InterfaceC27333b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f405813b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f405814c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f405815d;

    public C42410b(@l Integer num, @k String str, boolean z12) {
        this.f405813b = str;
        this.f405814c = num;
        this.f405815d = z12;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    /* renamed from: c */
    public final Integer getF60871f() {
        return null;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    /* renamed from: d */
    public final Integer getF60870e() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42410b)) {
            return false;
        }
        C42410b c42410b = (C42410b) obj;
        return L.f(this.f405813b, c42410b.f405813b) && L.f(this.f405814c, c42410b.f405814c) && this.f405815d == c42410b.f405815d;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @k
    /* renamed from: getTitle */
    public final String getF206739d() {
        String str = this.f405813b;
        Integer num = this.f405814c;
        if (num == null) {
            return str;
        }
        String str2 = str + ' ' + num.intValue();
        return str2 == null ? str : str2;
    }

    public final int hashCode() {
        int iHashCode = this.f405813b.hashCode() * 31;
        Integer num = this.f405814c;
        return Boolean.hashCode(this.f405815d) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isActive */
    public final boolean getF99070e() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled */
    public final boolean getF439534e() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF206738c() {
        return this.f405815d;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypeChip(name=");
        sb2.append(this.f405813b);
        sb2.append(", count=");
        sb2.append(this.f405814c);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f405815d, ')');
    }

    public /* synthetic */ C42410b(String str, Integer num, boolean z12, int i12, C42822w c42822w) {
        this(num, str, (i12 & 4) != 0 ? false : z12);
    }
}
