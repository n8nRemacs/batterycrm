package com.avito.android.photo_picker.legacy.provider;

import Y61.k;
import Y61.l;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.avito.android.di.C29972i;
import com.avito.android.di.component.J;
import com.avito.android.di.component.w;
import com.avito.android.photo_picker.legacy.di.c;
import com.avito.android.util.InterfaceC35827k0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoContentProvider.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/photo_picker/legacy/provider/PhotoContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "a", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class PhotoContentProvider extends ContentProvider {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f219834c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public InterfaceC35827k0 f219835b;

    /* compiled from: PhotoContentProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/legacy/provider/PhotoContentProvider$a;", "", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public final void a() {
        if (this.f219835b == null) {
            J.a aVarA = w.a();
            aVarA.b((c) C29972i.a(C29972i.b(this), c.class));
            aVarA.a(getContext().getContentResolver());
            aVarA.build().a(this);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(@k Uri uri, @l String str, @l String[] strArr) {
        a();
        InterfaceC35827k0 interfaceC35827k0 = this.f219835b;
        if (interfaceC35827k0 == null) {
            interfaceC35827k0 = null;
        }
        return interfaceC35827k0.d(uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    @l
    public final String getType(@k Uri uri) {
        a();
        InterfaceC35827k0 interfaceC35827k0 = this.f219835b;
        if (interfaceC35827k0 == null) {
            interfaceC35827k0 = null;
        }
        return interfaceC35827k0.e(uri);
    }

    @Override // android.content.ContentProvider
    @l
    public final Uri insert(@k Uri uri, @l ContentValues contentValues) {
        a();
        InterfaceC35827k0 interfaceC35827k0 = this.f219835b;
        if (interfaceC35827k0 == null) {
            interfaceC35827k0 = null;
        }
        return interfaceC35827k0.b(uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @l
    public final Cursor query(@k Uri uri, @l String[] strArr, @l String str, @l String[] strArr2, @l String str2) {
        a();
        InterfaceC35827k0 interfaceC35827k0 = this.f219835b;
        if (interfaceC35827k0 == null) {
            interfaceC35827k0 = null;
        }
        return interfaceC35827k0.a(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public final int update(@k Uri uri, @l ContentValues contentValues, @l String str, @l String[] strArr) {
        a();
        InterfaceC35827k0 interfaceC35827k0 = this.f219835b;
        if (interfaceC35827k0 == null) {
            interfaceC35827k0 = null;
        }
        return interfaceC35827k0.c(uri, contentValues, str, strArr);
    }
}
