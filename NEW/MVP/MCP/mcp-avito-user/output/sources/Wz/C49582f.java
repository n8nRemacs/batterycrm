package wZ;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MnzFloatingFooterDomain.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LwZ/f;", "", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wZ.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C49582f {

    /* renamed from: a, reason: collision with root package name */
    public final int f441555a;

    /* renamed from: b, reason: collision with root package name */
    public final float f441556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f441557c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f441558d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final k f441559e;

    public C49582f(int i12, float f12, @Y61.l AttributedText attributedText, @Y61.l String str, @Y61.l k kVar) {
        this.f441555a = i12;
        this.f441556b = f12;
        this.f441557c = attributedText;
        this.f441558d = str;
        this.f441559e = kVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49582f)) {
            return false;
        }
        C49582f c49582f = (C49582f) obj;
        return this.f441555a == c49582f.f441555a && Float.compare(this.f441556b, c49582f.f441556b) == 0 && L.f(this.f441557c, c49582f.f441557c) && L.f(this.f441558d, c49582f.f441558d) && L.f(this.f441559e, c49582f.f441559e);
    }

    public final int hashCode() {
        int iD2 = r.d(this.f441556b, Integer.hashCode(this.f441555a) * 31, 31);
        AttributedText attributedText = this.f441557c;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.f441558d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        k kVar = this.f441559e;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "MnzFloatingFooterContactDomain(count=" + this.f441555a + ", progress=" + this.f441556b + ", text=" + this.f441557c + ", iconName=" + this.f441558d + ", progressColor=" + this.f441559e + ')';
    }

    public /* synthetic */ C49582f(int i12, float f12, AttributedText attributedText, String str, k kVar, int i13, C42822w c42822w) {
        this(i12, f12, (i13 & 4) != 0 ? null : attributedText, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? null : kVar);
    }
}
