package com.avito.android.publish.start_publish;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.start_publish.StartPublishSheet;
import com.avito.android.remote.model.PublishStartInfo;
import io.reactivex.rxjava3.internal.operators.single.S;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StartPublishInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/start_publish/t;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface t {

    /* compiled from: StartPublishInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/start_publish/t$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<StartPublishSheet.SheetData.CategoryShortcutItem> f245433a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PublishStartInfo f245434b;

        public a(@Y61.k List<StartPublishSheet.SheetData.CategoryShortcutItem> list, @Y61.k PublishStartInfo publishStartInfo) {
            this.f245433a = list;
            this.f245434b = publishStartInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f245433a, aVar.f245433a) && kotlin.jvm.internal.L.f(this.f245434b, aVar.f245434b);
        }

        public final int hashCode() {
            return this.f245434b.hashCode() + (this.f245433a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ScreenData(shortcuts=" + this.f245433a + ", draftResponse=" + this.f245434b + ')';
        }
    }

    @Y61.k
    S a(boolean z12);

    @Y61.k
    S b();
}
