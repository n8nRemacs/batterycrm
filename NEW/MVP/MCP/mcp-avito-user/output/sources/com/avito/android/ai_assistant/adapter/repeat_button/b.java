package com.avito.android.ai_assistant.adapter.repeat_button;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RepeatButtonItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/repeat_button/b;", "Lcom/avito/android/ai_assistant/adapter/a;", "a", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b implements com.avito.android.ai_assistant.adapter.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88841b;

    /* compiled from: RepeatButtonItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/repeat_button/b$a;", "", "<init>", "()V", "", "ID", "Ljava/lang/String;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public b() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f88841b, ((b) obj).f88841b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78357k() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88841b() {
        return this.f88841b;
    }

    public final int hashCode() {
        return this.f88841b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("RepeatButtonItem(stringId="), this.f88841b, ')');
    }

    public b(String str, int i12, C42822w c42822w) {
        this.f88841b = (i12 & 1) != 0 ? "REPEAT_REQUEST_BUTTON" : str;
    }
}
