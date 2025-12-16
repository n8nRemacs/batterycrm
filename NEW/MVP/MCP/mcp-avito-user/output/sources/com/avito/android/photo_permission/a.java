package com.avito.android.photo_permission;

import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: PhotoPermissionDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_permission/a;", "", "a", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: PhotoPermissionDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_permission/a$a;", "", "_avito_photo-permission_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_permission.a$a, reason: collision with other inner class name */
    public interface InterfaceC6567a {
        void o3(@Y61.k PhotoPermissionResult photoPermissionResult);
    }

    void a(@Y61.k PhotoPermissionDialogData photoPermissionDialogData);

    @Y61.k
    LinkedHashSet b(@Y61.k PhotoPermissionDialogData photoPermissionDialogData);

    void c(@Y61.k InterfaceC6567a interfaceC6567a);
}
