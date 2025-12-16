package com.avito.android.ai_assistant.adapter.beduin;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/beduin/a;", "Lcom/avito/android/ai_assistant/adapter/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.android.ai_assistant.adapter.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88762b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f88763c;

    public a(@k String str, @k String str2) {
        this.f88762b = str;
        this.f88763c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f88762b, aVar.f88762b) && L.f(this.f88763c, aVar.f88763c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF301522b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88762b() {
        return this.f88762b;
    }

    public final int hashCode() {
        return this.f88763c.hashCode() + (this.f88762b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinItem(stringId=");
        sb2.append(this.f88762b);
        sb2.append(", beduinV2Content=");
        return C22026a.c(sb2, this.f88763c, ')');
    }
}
