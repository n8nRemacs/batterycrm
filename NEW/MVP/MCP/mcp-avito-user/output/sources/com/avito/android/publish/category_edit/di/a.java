package com.avito.android.publish.category_edit.di;

import Y61.k;
import Y61.l;
import com.avito.android.di.B;
import com.avito.android.publish.category_edit.CategoryEditSheet;
import com.avito.android.remote.model.Navigation;
import h31.d;
import kotlin.Metadata;

/* compiled from: CategoryEditComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/category_edit/di/a;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: CategoryEditComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/category_edit/di/a$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.category_edit.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC7064a {
        @h31.b
        @k
        InterfaceC7064a a(@k CategoryEditSheet categoryEditSheet);

        @h31.b
        @k
        InterfaceC7064a b(@k Navigation navigation2);

        @k
        a build();

        @k
        InterfaceC7064a c(@k b bVar);

        @h31.b
        @k
        InterfaceC7064a e(@l String str);
    }

    void a(@k CategoryEditSheet categoryEditSheet);
}
