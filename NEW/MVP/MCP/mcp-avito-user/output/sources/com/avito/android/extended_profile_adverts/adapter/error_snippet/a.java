package com.avito.android.extended_profile_adverts.adapter.error_snippet;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.serp.adapter.i1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ErrorSnippetItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_adverts/adapter/error_snippet/a;", "Lcom/avito/android/serp/adapter/i1;", "a", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements i1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f150572b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150573c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f150574d;

    /* compiled from: ErrorSnippetItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/extended_profile_adverts/adapter/error_snippet/a$a;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile_adverts.adapter.error_snippet.a$a, reason: collision with other inner class name */
    public static final class C4401a {
        public /* synthetic */ C4401a(C42822w c42822w) {
            this();
        }

        public C4401a() {
        }
    }

    static {
        new C4401a(null);
    }

    public a(String str, int i12, String str2, int i13, C42822w c42822w) {
        str2 = (i13 & 4) != 0 ? "error_snippet" : str2;
        this.f150572b = str;
        this.f150573c = i12;
        this.f150574d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f150572b, aVar.f150572b) && this.f150573c == aVar.f150573c && L.f(this.f150574d, aVar.f150574d);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF150573c() {
        return this.f150573c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154379b() {
        return this.f150574d;
    }

    public final int hashCode() {
        return this.f150574d.hashCode() + r.e(this.f150573c, this.f150572b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ErrorSnippetItem(message=");
        sb2.append(this.f150572b);
        sb2.append(", spanCount=");
        sb2.append(this.f150573c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f150574d, ')');
    }
}
