package eL0;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SetVasAutoprolongUseCase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LeL0/a;", "", "a", "_avito_vas-autoprolong_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC40020a {

    /* compiled from: SetVasAutoprolongUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LeL0/a$a;", "", "<init>", "()V", "a", "b", "LeL0/a$a$a;", "LeL0/a$a$b;", "_avito_vas-autoprolong_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eL0.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11070a {

        /* compiled from: SetVasAutoprolongUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeL0/a$a$a;", "LeL0/a$a;", "_avito_vas-autoprolong_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: eL0.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C11071a extends AbstractC11070a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final ApiError f395114a;

            public C11071a(@k ApiError apiError) {
                super(null);
                this.f395114a = apiError;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11071a) && L.f(this.f395114a, ((C11071a) obj).f395114a);
            }

            public final int hashCode() {
                return this.f395114a.hashCode();
            }

            @k
            public final String toString() {
                return c.n(new StringBuilder("Error(error="), this.f395114a, ')');
            }
        }

        /* compiled from: SetVasAutoprolongUseCase.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeL0/a$a$b;", "LeL0/a$a;", "_avito_vas-autoprolong_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: eL0.a$a$b */
        public static final /* data */ class b extends AbstractC11070a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DeepLink f395115a;

            public b(@k DeepLink deepLink) {
                super(null);
                this.f395115a = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f395115a, ((b) obj).f395115a);
            }

            public final int hashCode() {
                return this.f395115a.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("Success(deepLink="), this.f395115a, ')');
            }
        }

        public /* synthetic */ AbstractC11070a(C42822w c42822w) {
            this();
        }

        public AbstractC11070a() {
        }
    }

    @l
    Object a(long j12, @k String str, boolean z12, long j13, long j14, long j15, @k ContinuationImpl continuationImpl);
}
