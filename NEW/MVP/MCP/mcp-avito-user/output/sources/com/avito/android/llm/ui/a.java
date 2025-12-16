package com.avito.android.llm.ui;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.CharParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: LlmDescriptionAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/llm/ui/a;", "", "a", "b", "c", "d", "_avito_llm_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: LlmDescriptionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/llm/ui/a$a;", "Lcom/avito/android/llm/ui/a;", "_avito_llm_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.llm.ui.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5343a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CharParameter.AutoBeautification f181682a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.conveyor_item.a f181683b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final N f181684c;

        /* JADX WARN: Multi-variable type inference failed */
        public C5343a(@k CharParameter.AutoBeautification autoBeautification, @k com.avito.conveyor_item.a aVar, @k l<? super String, G0> lVar) {
            this.f181682a = autoBeautification;
            this.f181683b = aVar;
            this.f181684c = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5343a)) {
                return false;
            }
            C5343a c5343a = (C5343a) obj;
            return L.f(this.f181682a, c5343a.f181682a) && L.f(this.f181683b, c5343a.f181683b) && this.f181684c.equals(c5343a.f181684c);
        }

        public final int hashCode() {
            return this.f181684c.hashCode() + ((this.f181683b.hashCode() + (this.f181682a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Beautify(feature=");
            sb2.append(this.f181682a);
            sb2.append(", item=");
            sb2.append(this.f181683b);
            sb2.append(", onTextBeautify=");
            return C22026a.d(sb2, this.f181684c, ')');
        }
    }

    /* compiled from: LlmDescriptionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/llm/ui/a$b;", "Lcom/avito/android/llm/ui/a;", "<init>", "()V", "_avito_llm_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f181685a = new b();
    }

    /* compiled from: LlmDescriptionAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/llm/ui/a$c;", "Lcom/avito/android/llm/ui/a;", "_avito_llm_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f181686a;

        public c(@Y61.l String str) {
            this.f181686a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f181686a, ((c) obj).f181686a);
        }

        public final int hashCode() {
            String str = this.f181686a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChangeMainButtonText(newText="), this.f181686a, ')');
        }
    }

    /* compiled from: LlmDescriptionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/llm/ui/a$d;", "Lcom/avito/android/llm/ui/a;", "<init>", "()V", "_avito_llm_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f181687a = new d();
    }
}
