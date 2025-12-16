package com.google.android.play.core.splitcompat;

import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashSet f358668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f358669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f358670c;

    public k(p pVar, HashSet hashSet, v vVar) {
        this.f358670c = pVar;
        this.f358668a = hashSet;
        this.f358669b = vVar;
    }

    @Override // com.google.android.play.core.splitcompat.m
    public final void a(ZipFile zipFile, HashSet hashSet) {
        Pattern pattern = p.f358676b;
        HashSet hashSet2 = new HashSet();
        v vVar = this.f358669b;
        this.f358670c.c(vVar, hashSet, new l(hashSet2, vVar, zipFile));
        this.f358668a.addAll(hashSet2);
    }
}
