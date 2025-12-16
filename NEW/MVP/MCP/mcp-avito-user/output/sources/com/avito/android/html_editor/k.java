package com.avito.android.html_editor;

import hJ.AbstractC40837b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OperationTreeDisassembler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/html_editor/k;", "", "a", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface k {

    /* compiled from: OperationTreeDisassembler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_editor/k$a;", "", "_avito_html-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements Comparable<a> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final hJ.m f164148b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AbstractC40837b f164149c;

        public a(@Y61.k hJ.m mVar, @Y61.k AbstractC40837b abstractC40837b) {
            this.f164148b = mVar;
            this.f164149c = abstractC40837b;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            hJ.m mVar = aVar.f164148b;
            hJ.m mVar2 = this.f164148b;
            if (mVar2.g(mVar)) {
                return -1;
            }
            return mVar2.c(mVar) ? 1 : 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f164148b, aVar.f164148b) && L.f(this.f164149c, aVar.f164149c);
        }

        public final int hashCode() {
            return this.f164149c.hashCode() + (this.f164148b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "NodeOperation(node=" + this.f164148b + ", operation=" + this.f164149c + ')';
        }
    }
}
