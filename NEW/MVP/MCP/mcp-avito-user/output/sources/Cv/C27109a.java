package cV;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.lib.design.gallery.c;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GalleryState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcV/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C27109a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<c> f57908a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f57909b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Runnable f57910c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Y41.l<Integer, G0> f57911d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Y41.l<Boolean, G0> f57912e;

    /* JADX WARN: Multi-variable type inference failed */
    public C27109a(@k List<? extends c> list, @l Integer num, @l Runnable runnable, @l Y41.l<? super Integer, G0> lVar, @l Y41.l<? super Boolean, G0> lVar2) {
        this.f57908a = list;
        this.f57909b = num;
        this.f57910c = runnable;
        this.f57911d = lVar;
        this.f57912e = lVar2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27109a)) {
            return false;
        }
        C27109a c27109a = (C27109a) obj;
        return L.f(this.f57908a, c27109a.f57908a) && L.f(this.f57909b, c27109a.f57909b) && L.f(this.f57910c, c27109a.f57910c) && L.f(this.f57911d, c27109a.f57911d) && L.f(this.f57912e, c27109a.f57912e);
    }

    public final int hashCode() {
        int iHashCode = this.f57908a.hashCode() * 31;
        Integer num = this.f57909b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Runnable runnable = this.f57910c;
        int iHashCode3 = (iHashCode2 + (runnable == null ? 0 : runnable.hashCode())) * 31;
        Y41.l<Integer, G0> lVar = this.f57911d;
        int iHashCode4 = (iHashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Y41.l<Boolean, G0> lVar2 = this.f57912e;
        return iHashCode4 + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryState(data=");
        sb2.append(this.f57908a);
        sb2.append(", backgroundColor=");
        sb2.append(this.f57909b);
        sb2.append(", commitCallback=");
        sb2.append(this.f57910c);
        sb2.append(", onPageSelected=");
        sb2.append(this.f57911d);
        sb2.append(", pageIndicatorVisibilityCallback=");
        return H.l(sb2, this.f57912e, ')');
    }

    public /* synthetic */ C27109a(List list, Integer num, Runnable runnable, Y41.l lVar, Y41.l lVar2, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : runnable, (i12 & 8) != 0 ? null : lVar, (i12 & 16) != 0 ? null : lVar2);
    }
}
