package com.avito.android.ai_assistant.adapter.append;

import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AppendItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/append/b;", "Lcom/avito/android/ai_assistant/adapter/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b implements com.avito.android.ai_assistant.adapter.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88732b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AppendState f88733c;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f88732b, bVar.f88732b) && this.f88733c == bVar.f88733c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83559c() {
        return this.f88732b;
    }

    public final int hashCode() {
        return this.f88733c.hashCode() + (this.f88732b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "AppendItem(stringId=" + this.f88732b + ", appendState=" + this.f88733c + ')';
    }

    public b(@Y61.k String str, @Y61.k AppendState appendState) {
        this.f88732b = str;
        this.f88733c = appendState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(String str, AppendState appendState, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            str = "append_item" + UUID.randomUUID();
        }
        this(str, (i12 & 2) != 0 ? AppendState.f88727b : appendState);
    }
}
