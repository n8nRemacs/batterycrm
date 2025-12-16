package com.google.android.play.core.splitcompat;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f358664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashSet f358665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f358666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f358667d;

    public j(p pVar, v vVar, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.f358667d = pVar;
        this.f358664a = vVar;
        this.f358665b = hashSet;
        this.f358666c = atomicBoolean;
    }

    @Override // com.google.android.play.core.splitcompat.m
    public final void a(ZipFile zipFile, HashSet hashSet) {
        i iVar = new i(this);
        Pattern pattern = p.f358676b;
        this.f358667d.c(this.f358664a, hashSet, iVar);
    }
}
