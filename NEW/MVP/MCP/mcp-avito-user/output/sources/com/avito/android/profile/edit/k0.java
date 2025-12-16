package com.avito.android.profile.edit;

import com.avito.android.util.NotFoundException;
import kotlin.Metadata;

/* compiled from: SaveProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class k0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final k0<T, R> f222220b = new k0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Boolean.valueOf(!(((Throwable) obj) instanceof NotFoundException));
    }
}
