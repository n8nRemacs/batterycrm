package com.avito.android.publish.items.file_uploader;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.publish.file_uploader.o;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FileUploaderItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/file_uploader/b;", "Lcom/avito/android/publish/items/file_uploader/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.items.file_uploader.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f236800a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f236801b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f236802c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f236803d = new g.a<>(R.layout.file_uploader_item, new a());

    /* compiled from: FileUploaderItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/file_uploader/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/file_uploader/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, l> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new l(view, bVar.f236801b, bVar.f236802c);
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k o oVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f236800a = dVar;
        this.f236801b = oVar;
        this.f236802c = interfaceC35745a5;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f236800a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f236803d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof ParameterElement.l) {
            ParameterElement.l lVar = (ParameterElement.l) aVar;
            if (!lVar.f117468r && !lVar.f117469s) {
                return true;
            }
        }
        return false;
    }
}
