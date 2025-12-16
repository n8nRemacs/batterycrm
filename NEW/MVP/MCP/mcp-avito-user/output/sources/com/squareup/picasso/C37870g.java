package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.C;
import com.squareup.picasso.Picasso;
import java.io.FileNotFoundException;
import java.io.InputStream;
import okio.M;

/* compiled from: ContactsPhotoRequestHandler.java */
/* renamed from: com.squareup.picasso.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C37870g extends C {

    /* renamed from: b, reason: collision with root package name */
    public static final UriMatcher f366431b;

    /* renamed from: a, reason: collision with root package name */
    public final Context f366432a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f366431b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public C37870g(Context context) {
        this.f366432a = context;
    }

    @Override // com.squareup.picasso.C
    public final boolean b(A a12) {
        Uri uri = a12.f366289a;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f366431b.match(uri) != -1;
    }

    @Override // com.squareup.picasso.C
    public final C.a e(A a12, int i12) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f366432a.getContentResolver();
        Uri uriLookupContact = a12.f366289a;
        int iMatch = f366431b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch != 3) {
                    if (iMatch != 4) {
                        throw new IllegalStateException(androidx.appcompat.app.r.n(uriLookupContact, "Invalid uri: "));
                    }
                }
            }
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uriLookupContact);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
            inputStreamOpenContactPhotoInputStream = uriLookupContact == null ? null : ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
        }
        if (inputStreamOpenContactPhotoInputStream == null) {
            return null;
        }
        return new C.a(M.g(inputStreamOpenContactPhotoInputStream), Picasso.LoadedFrom.DISK);
    }
}
