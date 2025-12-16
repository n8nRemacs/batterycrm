package qe0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertDuplicateResult;
import com.avito.android.remote.model.adverts.AdvertProactiveModerationResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MergePretendPremoderationAction.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lqe0/a;", "", "<init>", "()V", "a", "b", "c", "Lqe0/a$a;", "Lqe0/a$b;", "Lqe0/a$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qe0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC47390a {

    /* compiled from: MergePretendPremoderationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqe0/a$a;", "Lqe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qe0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12331a extends AbstractC47390a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertDuplicateResult f429329a;

        public C12331a(@k AdvertDuplicateResult advertDuplicateResult) {
            super(null);
            this.f429329a = advertDuplicateResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12331a) && L.f(this.f429329a, ((C12331a) obj).f429329a);
        }

        public final int hashCode() {
            return this.f429329a.hashCode();
        }

        @k
        public final String toString() {
            return "Duplicate(result=" + this.f429329a + ')';
        }
    }

    /* compiled from: MergePretendPremoderationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqe0/a$b;", "Lqe0/a;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qe0.a$b */
    public static final class b extends AbstractC47390a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f429330a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: MergePretendPremoderationAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqe0/a$c;", "Lqe0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qe0.a$c */
    public static final /* data */ class c extends AbstractC47390a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AdvertProactiveModerationResult.WrongCategorySuggest f429331a;

        public c(@k AdvertProactiveModerationResult.WrongCategorySuggest wrongCategorySuggest) {
            super(null);
            this.f429331a = wrongCategorySuggest;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f429331a, ((c) obj).f429331a);
        }

        public final int hashCode() {
            return this.f429331a.hashCode();
        }

        @k
        public final String toString() {
            return "WrongCategory(suggest=" + this.f429331a + ')';
        }
    }

    public /* synthetic */ AbstractC47390a(C42822w c42822w) {
        this();
    }

    public AbstractC47390a() {
    }
}
