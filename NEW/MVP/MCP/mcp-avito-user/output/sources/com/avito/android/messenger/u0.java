package com.avito.android.messenger;

import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.K3;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.text.C43044a;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: TextToChunkConverter.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/u0;", "Lcom/avito/android/messenger/q0;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f197431a = C42727D.c(a.f197432l);

    /* compiled from: TextToChunkConverter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/regex/Pattern;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Pattern> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f197432l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Pattern invoke() {
            return new C43059p("[[a-zA-Z0-9][\\\\!\"#$%&'\\(\\)\\*\\+,-\\./:;\\<\\=\\>\\?@\\[\\]\\^_`\\{\\|\\}~]]+").f410623b;
        }
    }

    @Override // com.avito.android.messenger.q0
    @Y61.k
    public final ArrayList a(@Y61.k String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i12 = length - 1;
        K3.f318642a.getClass();
        Matcher matcher = K3.f318643b.matcher(str);
        int i13 = -1;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            int i14 = iEnd - 1;
            if (iStart <= 0 || str.charAt(iStart - 1) != '@') {
                if (i14 >= str.length() - 1 || str.charAt(iEnd) != '@') {
                    if (((Pattern) this.f197431a.getValue()).matcher(str.substring(iStart, i14)).matches()) {
                        int i15 = i13 + 1;
                        int i16 = iStart - 1;
                        if (i16 - i15 >= 0 && !C43066x.K(str.substring(i15, iStart))) {
                            while (C43044a.d(str.charAt(i15))) {
                                i15++;
                            }
                            while (C43044a.d(str.charAt(i16))) {
                                i16--;
                            }
                            arrayList.add(new MessageBody.Text.Chunk.Plain(i15, i16));
                        }
                        arrayList.add(new MessageBody.Text.Chunk.Link(iStart, i14));
                        i13 = i14;
                    }
                }
            }
        }
        int i17 = i13 + 1;
        if (i12 - i17 >= 0 && !C43066x.K(str.substring(i17, length))) {
            while (C43044a.d(str.charAt(i17))) {
                i17++;
            }
            while (C43044a.d(str.charAt(i12))) {
                i12--;
            }
            arrayList.add(new MessageBody.Text.Chunk.Plain(i17, i12));
        }
        return arrayList;
    }
}
