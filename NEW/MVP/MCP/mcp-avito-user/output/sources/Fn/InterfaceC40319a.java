package fN;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvGoodsPollAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LfN/a;", "", "a", "b", "LfN/a$a;", "LfN/a$b;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fN.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC40319a {

    /* compiled from: ImvGoodsPollAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfN/a$a;", "LfN/a;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fN.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11146a implements InterfaceC40319a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395858a;

        public C11146a(@k String str) {
            this.f395858a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11146a) && L.f(this.f395858a, ((C11146a) obj).f395858a);
        }

        public final int hashCode() {
            return this.f395858a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SendGoodsPollAnswers(inputText="), this.f395858a, ')');
        }
    }

    /* compiled from: ImvGoodsPollAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LfN/a$b;", "LfN/a;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: fN.a$b */
    public static final /* data */ class b implements InterfaceC40319a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f395859a;

        public b(@k ArrayList arrayList) {
            this.f395859a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f395859a.equals(((b) obj).f395859a);
        }

        public final int hashCode() {
            return this.f395859a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("UpdateItems(options="), this.f395859a, ')');
        }
    }
}
