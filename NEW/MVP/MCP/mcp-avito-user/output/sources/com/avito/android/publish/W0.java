package com.avito.android.publish;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: SubmissionPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/W0;", "", "b", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface W0 {

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(W0 w02, boolean z12, int i12) {
            if ((i12 & 1) != 0) {
                z12 = false;
            }
            return w02.b(z12, true);
        }
    }

    /* compiled from: SubmissionPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/W0$b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void L0(@Y61.k String str);

        void a(@Y61.k DeepLink deepLink);
    }

    void a(boolean z12, boolean z13);

    boolean b(boolean z12, boolean z13);

    void c();

    void d(@Y61.k O0 o02);

    void e();

    void f(@Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2);

    void i();
}
