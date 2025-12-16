package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.k;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.util.Iterator;

/* compiled from: JsonNode.java */
/* loaded from: classes4.dex */
public abstract class j extends k.a implements com.fasterxml.jackson.core.p, Iterable<j> {

    /* compiled from: JsonNode.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f342117a;

        static {
            int[] iArr = new int[JsonNodeType.values().length];
            f342117a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f342117a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f342117a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Iterator<j> e() {
        return com.fasterxml.jackson.databind.util.g.f342598c;
    }

    @Override // java.lang.Iterable
    public final Iterator<j> iterator() {
        return e();
    }
}
