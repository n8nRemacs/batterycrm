package com.avito.android.search.filter.converter;

import com.avito.android.remote.model.Sublocation;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryParameterStringValueConverter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/Sublocation;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class f extends N implements Y41.l<Sublocation, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final f f262975l = new f();

    public f() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Sublocation sublocation) {
        String title = sublocation.getTitle();
        return title != null ? title : "";
    }
}
