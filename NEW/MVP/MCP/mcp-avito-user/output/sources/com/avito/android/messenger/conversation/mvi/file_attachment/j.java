package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.file_attachment.FileAttachmentException;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.maybe.C41916j;
import io.reactivex.rxjava3.internal.operators.maybe.e0;
import io.reactivex.rxjava3.internal.operators.maybe.j0;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: FileAttachmentInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/j;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f190715a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f190716b;

    @Inject
    public j(@Y61.k n nVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f190715a = nVar;
        this.f190716b = interfaceC35745a5;
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.a
    @Y61.k
    public final String[] a(@Y61.k AttachMenuItem.File file) {
        Collection arrayList;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        List<String> extensions = file.getExtensions();
        if (extensions != null) {
            List<String> list = extensions;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(C43066x.U(".", (String) it.next()));
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension((String) it2.next());
                if (mimeTypeFromExtension != null) {
                    arrayList.add(mimeTypeFromExtension);
                }
            }
        } else {
            arrayList = C42784z0.f406748b;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.a
    @Y61.k
    public final W b(@Y61.k Uri uri, boolean z12, long j12, long j13, @Y61.l String str) {
        C41916j c41916jD = this.f190715a.d(uri, str);
        l41.o oVar = e.f190706b;
        Objects.requireNonNull(oVar, "fallbackSupplier is null");
        return new j0(new e0(c41916jD, oVar), I.l(FileAttachmentException.NoSuchFileFoundException.f190698b)).n(new f(j12, this, j13)).t(new g(z12, this, uri)).n(new h(this)).z(this.f190716b.a());
    }

    @Override // com.avito.android.messenger.conversation.mvi.file_attachment.a
    @Y61.k
    public final W c(@Y61.k Uri uri, long j12) {
        return this.f190715a.i(uri, null).t(i.f190714b).n(new b(this, j12)).t(new c(this, uri)).n(new d(this)).z(this.f190716b.a());
    }
}
