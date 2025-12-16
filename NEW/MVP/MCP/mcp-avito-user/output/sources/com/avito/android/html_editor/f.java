package com.avito.android.html_editor;

import android.text.Spanned;
import com.avito.android.html_formatter.HtmlCharSequence;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HtmlInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/html_editor/f;", "", "a", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface f {

    /* compiled from: HtmlInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_editor/f$a;", "", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f164136a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final HtmlCharSequence f164137b;

        /* renamed from: c, reason: collision with root package name */
        public final int f164138c;

        public a(@Y61.k String str, @Y61.k HtmlCharSequence htmlCharSequence, int i12) {
            this.f164136a = str;
            this.f164137b = htmlCharSequence;
            this.f164138c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f164136a, aVar.f164136a) && L.f(this.f164137b, aVar.f164137b) && this.f164138c == aVar.f164138c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f164138c) + ((this.f164137b.hashCode() + (this.f164136a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OperationResult(html=");
            sb2.append(this.f164136a);
            sb2.append(", renderedText=");
            sb2.append((Object) this.f164137b);
            sb2.append(", cursorShift=");
            return androidx.appcompat.app.r.t(sb2, this.f164138c, ')');
        }
    }

    void a();

    int b(@Y61.k Spanned spanned, int i12, int i13);
}
