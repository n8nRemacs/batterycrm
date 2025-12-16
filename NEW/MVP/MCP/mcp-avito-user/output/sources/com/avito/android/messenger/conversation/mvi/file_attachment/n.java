package com.avito.android.messenger.conversation.mvi.file_attachment;

import android.net.Uri;
import io.reactivex.rxjava3.internal.operators.completable.I;
import io.reactivex.rxjava3.internal.operators.maybe.C41916j;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.io.File;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: FileStorageHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/n;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface n {

    /* compiled from: FileStorageHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/n$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: FileStorageHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    @Y61.k
    G a();

    @Y61.k
    G b(@Y61.k String str);

    @Y61.k
    G c(@Y61.k File file, @Y61.k String str, @Y61.k String str2);

    @Y61.k
    C41916j d(@Y61.k Uri uri, @Y61.l String str);

    @Y61.k
    G e(@Y61.k Uri uri);

    @Y61.k
    String f(@Y61.k String str, @Y61.l String str2);

    @Y61.k
    G g(@Y61.k Uri uri);

    @Y61.k
    G h(@Y61.k File file);

    @Y61.k
    G i(@Y61.k Uri uri, @Y61.l String str);

    @Y61.k
    G j(@Y61.k String str);

    @Y61.k
    G k(@Y61.k String str);

    @Y61.k
    G l(@Y61.k File file);

    @Y61.k
    InputStream m(@Y61.k Uri uri);

    @Y61.k
    G n(@Y61.k String str);

    @Y61.k
    G o(@Y61.k String str);

    @Y61.k
    G p();

    @Y61.l
    String q(@Y61.k String str);

    @Y61.k
    G r();

    @Y61.k
    G s(@Y61.k File file, long j12);

    @Y61.k
    G t(@Y61.k String str);

    @Y61.k
    G u();

    @Y61.k
    I v(@Y61.k Uri uri);

    @Y61.k
    G w(@Y61.k File file, @Y61.k String str);

    @Y61.k
    I x();
}
