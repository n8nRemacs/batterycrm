package com.avito.android.publish.infomodel_request;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.PublishState;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfomodelRequestViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/infomodel_request/a;", "", "a", "b", "Lcom/avito/android/publish/infomodel_request/a$a;", "Lcom/avito/android/publish/infomodel_request/a$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
interface a {

    /* compiled from: InfomodelRequestViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/infomodel_request/a$a;", "Lcom/avito/android/publish/infomodel_request/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.infomodel_request.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7112a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final CategoryParameters f236091a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final PublishState f236092b;

        public C7112a(@Y61.k CategoryParameters categoryParameters, @Y61.l PublishState publishState) {
            this.f236091a = categoryParameters;
            this.f236092b = publishState;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7112a)) {
                return false;
            }
            C7112a c7112a = (C7112a) obj;
            return L.f(this.f236091a, c7112a.f236091a) && L.f(this.f236092b, c7112a.f236092b);
        }

        public final int hashCode() {
            int iHashCode = this.f236091a.hashCode() * 31;
            PublishState publishState = this.f236092b;
            return iHashCode + (publishState == null ? 0 : publishState.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "CategoryParametersWithState(parameters=" + this.f236091a + ", state=" + this.f236092b + ')';
        }
    }

    /* compiled from: InfomodelRequestViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/infomodel_request/a$b;", "Lcom/avito/android/publish/infomodel_request/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f236093a;

        public b(@Y61.k DeepLink deepLink) {
            this.f236093a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f236093a, ((b) obj).f236093a);
        }

        public final int hashCode() {
            return this.f236093a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("RedirectUri(uri="), this.f236093a, ')');
        }
    }
}
