package org.mockito.internal.progress;

import V71.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/* compiled from: ArgumentMatcherStorageImpl.java */
/* loaded from: classes7.dex */
public class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Stack<t> f421694a = new Stack<>();

    @Override // org.mockito.internal.progress.a
    public final List<t> a() {
        Stack<t> stack = this.f421694a;
        if (stack.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(stack);
        stack.clear();
        return arrayList;
    }
}
