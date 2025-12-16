package com.avito.android.publish.items.file_uploader_redesign;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.mandatory_verification.items.uploader.o;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FileUploaderRedesignItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/file_uploader_redesign/c;", "Lcom/avito/android/publish/items/file_uploader_redesign/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.publish.items.file_uploader_redesign.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f236829a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f236830b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<o> f236831c = new g.a<>(R.layout.mandatory_verification_uploader_item, new a());

    /* compiled from: FileUploaderRedesignItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/mandatory_verification/items/uploader/o;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/mandatory_verification/items/uploader/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, o> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final o invoke(ViewGroup viewGroup, View view) {
            c cVar = c.this;
            return new o(view, cVar.f236830b, new b(cVar));
        }
    }

    @Inject
    public c(@Y61.k e eVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f236829a = eVar;
        this.f236830b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f236829a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<o> b() {
        return this.f236831c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.l) && ((ParameterElement.l) aVar).f117468r;
    }
}
