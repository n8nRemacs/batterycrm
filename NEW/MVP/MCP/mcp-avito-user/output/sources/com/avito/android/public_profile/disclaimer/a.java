package com.avito.android.public_profile.disclaimer;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.grid.GridElementType;
import com.avito.android.serp.adapter.i1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublicProfileDisclaimerItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/public_profile/disclaimer/a;", "Lcom/avito/android/serp/adapter/i1;", "LQH/a;", "a", "_avito_public-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements i1, QH.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231811b;

    /* renamed from: c, reason: collision with root package name */
    public final int f231812c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f231813d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GridElementType f231814e;

    /* compiled from: PublicProfileDisclaimerItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/public_profile/disclaimer/a$a;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "_avito_public-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.public_profile.disclaimer.a$a, reason: collision with other inner class name */
    public static final class C7062a {
        public /* synthetic */ C7062a(C42822w c42822w) {
            this();
        }

        public C7062a() {
        }
    }

    static {
        new C7062a(null);
    }

    public a(String str, int i12, String str2, GridElementType gridElementType, int i13, C42822w c42822w) {
        i12 = (i13 & 2) != 0 ? 0 : i12;
        str2 = (i13 & 4) != 0 ? "disclaimer_item" : str2;
        gridElementType = (i13 & 8) != 0 ? GridElementType.FullWidth.f161209b : gridElementType;
        this.f231811b = str;
        this.f231812c = i12;
        this.f231813d = str2;
        this.f231814e = gridElementType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f231811b, aVar.f231811b) && this.f231812c == aVar.f231812c && L.f(this.f231813d, aVar.f231813d) && L.f(this.f231814e, aVar.f231814e);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154957c() {
        return this.f231814e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF155505g() {
        return this.f231812c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229535b() {
        return this.f231813d;
    }

    public final int hashCode() {
        return this.f231814e.hashCode() + H.d(r.e(this.f231812c, this.f231811b.hashCode() * 31, 31), 31, this.f231813d);
    }

    @k
    public final String toString() {
        return "PublicProfileDisclaimerItem(text=" + this.f231811b + ", spanCount=" + this.f231812c + ", stringId=" + this.f231813d + ", gridType=" + this.f231814e + ')';
    }
}
