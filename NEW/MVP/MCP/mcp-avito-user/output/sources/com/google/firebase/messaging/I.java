package com.google.firebase.messaging;

import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: TopicOperation.java */
/* loaded from: classes6.dex */
final class I {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f361781d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f361782a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361783b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361784c;

    public I(String str, String str2) {
        String strSubstring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (strSubstring == null || !f361781d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(AK.c.k("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.f361782a = strSubstring;
        this.f361783b = str;
        this.f361784c = androidx.appcompat.app.r.r(str, "!", str2);
    }

    public final boolean equals(@j.P Object obj) {
        if (!(obj instanceof I)) {
            return false;
        }
        I i12 = (I) obj;
        return this.f361782a.equals(i12.f361782a) && this.f361783b.equals(i12.f361783b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f361783b, this.f361782a});
    }
}
