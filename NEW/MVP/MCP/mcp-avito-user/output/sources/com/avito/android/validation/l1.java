package com.avito.android.validation;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.validation.n1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubmissionListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/validation/l1;", "", "b", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface l1 {

    /* compiled from: SubmissionListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: SubmissionListener.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/validation/l1$b;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/validation/l1$b$a;", "Lcom/avito/android/validation/l1$b$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: SubmissionListener.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/validation/l1$b$a;", "Lcom/avito/android/validation/l1$b;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {
            public a() {
                super(null);
            }
        }

        /* compiled from: SubmissionListener.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/validation/l1$b$b;", "Lcom/avito/android/validation/l1$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.validation.l1$b$b, reason: collision with other inner class name */
        public static final class C9896b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f319395a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f319396b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final ArrayList f319397c;

            public C9896b(@Y61.l ArrayList arrayList, boolean z12, boolean z13) {
                super(null);
                this.f319395a = z12;
                this.f319396b = z13;
                this.f319397c = arrayList;
            }

            @Y61.l
            public final DeepLink a() {
                n1.a aVar;
                ArrayList arrayList = this.f319397c;
                if (arrayList == null || (aVar = (n1.a) C42745f0.G(arrayList)) == null) {
                    return null;
                }
                return aVar.f319406e;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.O h(@Y61.k List list, @Y61.k Set set);
}
