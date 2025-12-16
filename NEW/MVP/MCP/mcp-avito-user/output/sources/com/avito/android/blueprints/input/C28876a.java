package com.avito.android.blueprints.input;

import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.CharParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: AutoDescriptionPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/input/a;", "Lcom/avito/android/llm/ui/a;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.blueprints.input.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C28876a implements com.avito.android.llm.ui.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CharParameter.AutoDescription.DescriptionLoadingOverlay f105931a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final CharParameter.AutoDescription.ConfirmDialog f105932b;

    /* renamed from: c, reason: collision with root package name */
    public final long f105933c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ItemWithState f105934d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final H f105935e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f105936f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final H f105937g;

    /* JADX WARN: Multi-variable type inference failed */
    public C28876a(@Y61.k CharParameter.AutoDescription.DescriptionLoadingOverlay descriptionLoadingOverlay, @Y61.l CharParameter.AutoDescription.ConfirmDialog confirmDialog, long j12, @Y61.k ItemWithState itemWithState, @Y61.k Y41.l<? super String, G0> lVar, boolean z12, @Y61.k Y41.a<G0> aVar) {
        this.f105931a = descriptionLoadingOverlay;
        this.f105932b = confirmDialog;
        this.f105933c = j12;
        this.f105934d = itemWithState;
        this.f105935e = (H) lVar;
        this.f105936f = z12;
        this.f105937g = (H) aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28876a)) {
            return false;
        }
        C28876a c28876a = (C28876a) obj;
        return L.f(this.f105931a, c28876a.f105931a) && L.f(this.f105932b, c28876a.f105932b) && this.f105933c == c28876a.f105933c && L.f(this.f105934d, c28876a.f105934d) && this.f105935e.equals(c28876a.f105935e) && this.f105936f == c28876a.f105936f && this.f105937g.equals(c28876a.f105937g);
    }

    public final int hashCode() {
        int iHashCode = this.f105931a.hashCode() * 31;
        CharParameter.AutoDescription.ConfirmDialog confirmDialog = this.f105932b;
        return this.f105937g.hashCode() + androidx.appcompat.app.r.i((this.f105935e.hashCode() + ((this.f105934d.hashCode() + androidx.appcompat.app.r.g((iHashCode + (confirmDialog == null ? 0 : confirmDialog.hashCode())) * 31, 31, this.f105933c)) * 31)) * 31, 31, this.f105936f);
    }

    @Y61.k
    public final String toString() {
        return "AutoDescriptionPayload(overlay=" + this.f105931a + ", dialog=" + this.f105932b + ", delay=" + this.f105933c + ", item=" + this.f105934d + ", onDescriptionGenerated=" + this.f105935e + ", isValidationEnabled=" + this.f105936f + ", showValidationError=" + this.f105937g + ')';
    }
}
