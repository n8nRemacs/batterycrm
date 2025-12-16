package com.avito.android.photo_picker.legacy;

import kotlin.Metadata;
import l41.InterfaceC43544b;

/* compiled from: PhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\r\u0010\u0002\u001a\t\u0018\u00010\u0000¢\u0006\u0002\b\u00012\r\u0010\u0004\u001a\t\u0018\u00010\u0003¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lj41/f;", "shouldWait", "", "<anonymous parameter 1>", "Lkotlin/G0;", "accept", "(Ljava/lang/Boolean;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_picker.legacy.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33246h<T1, T2> implements InterfaceC43544b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f219825b;

    public C33246h(E e12) {
        this.f219825b = e12;
    }

    @Override // l41.InterfaceC43544b
    public final void accept(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            this.f219825b.f219592o.f219643a.setLoading(bool.booleanValue());
        }
    }
}
