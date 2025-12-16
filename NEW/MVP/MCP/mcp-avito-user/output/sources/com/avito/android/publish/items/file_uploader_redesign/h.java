package com.avito.android.publish.items.file_uploader_redesign;

import Y41.l;
import com.avito.android.category_parameters.ParameterElement;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: FileUploaderRedesignItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements l<List<? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f236842l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.l f236843m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, ParameterElement.l lVar) {
        super(1);
        this.f236842l = fVar;
        this.f236843m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(List<? extends String> list) {
        f fVar = this.f236842l;
        C43259k.d(fVar.f236838d, null, null, new g(fVar, this.f236843m, null), 3);
        return G0.f406611a;
    }
}
