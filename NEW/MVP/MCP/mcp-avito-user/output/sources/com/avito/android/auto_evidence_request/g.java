package com.avito.android.auto_evidence_request;

import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.validation.Block;
import com.avito.android.remote.model.validation.Validation;
import com.avito.android.util.InterfaceC35863o4;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoEvidenceRequestMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/g;", "", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f95177a;

    @Inject
    public g(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f95177a = interfaceC35863o4;
    }

    public static AttributedText a(List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Block) next) instanceof Block.AttributedTextWrapper) {
                break;
            }
        }
        Block.AttributedTextWrapper attributedTextWrapper = next instanceof Block.AttributedTextWrapper ? (Block.AttributedTextWrapper) next : null;
        if (attributedTextWrapper != null) {
            return attributedTextWrapper.getText();
        }
        return null;
    }

    public static Validation b(String str, List list) {
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((Validation) next).getRule(), str)) {
                obj = next;
                break;
            }
        }
        return (Validation) obj;
    }
}
