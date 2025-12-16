package ru.cyberity.cbr.core.presentation.helper;

import Y41.l;
import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.r;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: DocumentItemsHelper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentItemsHelperKt$viewItemForDocument$docTypes$3 extends N implements l<String, CharSequence> {
    final /* synthetic */ c.C12476c $strings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentItemsHelperKt$viewItemForDocument$docTypes$3(c.C12476c c12476c) {
        super(1);
        this.$strings = c12476c;
    }

    @Override // Y41.l
    @k
    public final CharSequence invoke(@k String str) {
        return r.a(r.INSTANCE.a(str), this.$strings, null, 2, null);
    }
}
