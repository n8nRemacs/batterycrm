package gu;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DataPickerShowOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lgu/b;", "", "a", "Lgu/b$a;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gu.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC40737b {

    /* compiled from: DataPickerShowOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgu/b$a;", "Lgu/b;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gu.b$a */
    public static final /* data */ class a implements InterfaceC40737b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final List<String> f396930a;

        public a(@l List<String> list) {
            this.f396930a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f396930a, ((a) obj).f396930a);
        }

        public final int hashCode() {
            List<String> list = this.f396930a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Close(preselected="), this.f396930a, ')');
        }
    }
}
