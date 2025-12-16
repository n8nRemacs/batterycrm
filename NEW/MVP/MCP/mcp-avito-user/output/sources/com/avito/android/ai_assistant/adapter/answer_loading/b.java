package com.avito.android.ai_assistant.adapter.answer_loading;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AnswerLoadingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/answer_loading/b;", "Lcom/avito/android/ai_assistant/adapter/a;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b implements com.avito.android.ai_assistant.adapter.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88720b;

    public b() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f88720b, ((b) obj).f88720b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88720b() {
        return this.f88720b;
    }

    public final int hashCode() {
        return this.f88720b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("AnswerLoadingItem(stringId="), this.f88720b, ')');
    }

    public b(String str, int i12, C42822w c42822w) {
        this.f88720b = (i12 & 1) != 0 ? "answer_loading_item" : str;
    }
}
