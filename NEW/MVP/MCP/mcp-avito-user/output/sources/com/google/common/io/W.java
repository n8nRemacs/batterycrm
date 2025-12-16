package com.google.common.io;

import com.google.common.collect.AbstractC37401r1;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.FileAttribute;

/* compiled from: TempFileCreator.java */
/* loaded from: classes6.dex */
class W implements FileAttribute<AbstractC37401r1<AclEntry>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC37401r1 f360325a;

    public W(AbstractC37401r1 abstractC37401r1) {
        this.f360325a = abstractC37401r1;
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final String name() {
        return "acl:acl";
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final AbstractC37401r1<AclEntry> value() {
        return this.f360325a;
    }
}
